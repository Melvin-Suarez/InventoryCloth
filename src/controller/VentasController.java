package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Producto;
import model.Ventas;

public class VentasController extends DefaultTableModel {
    
    private List<Ventas> temporal;
    private Listas lista = Listas.getInstance();
    private static int celda;
    private int indice = 0;
    
    public VentasController() {
        super();
        temporal = new ArrayList<>();
        agregarColumnas();
    }
    
    private void agregarColumnas() {
        this.addColumn("Codigo de barra");
        this.addColumn("Marca");
        this.addColumn("Categoria");
        this.addColumn("Precio");
        this.addColumn("Cantidad");
        this.addColumn("Descuento");
        this.addColumn("Subtotal");
    }
    
    public void llenarTabla() {
        // Limpiar la tabla antes de llenarla
        this.setRowCount(0);
        
        for(Ventas pro : temporal) {
            String[] renglon = {
                pro.getBarcode(),
                pro.getMarca(),
                pro.getCategoria(),
                Double.toString(pro.getPrecio()),
                Integer.toString(pro.getCantidad()),
                Double.toString(pro.getDecount()),
                Double.toString(pro.getSubTotal())
            };
            
            this.addRow(renglon);
        }
        lista.ordenarLista();
    }
    
    public void Vender(String barcode, int cantidad) {
        lista.ordenarLista();
        Producto pro = setBuscarProducto(barcode);
        System.out.println(pro.getMarca());
        Ventas venta = new Ventas();
        venta.setBarcode(pro.getBarcode());
        venta.setMarca(pro.getMarca());
        venta.setCategoria(pro.getCategoria());
        venta.setPrecio(pro.getPrecio());
        int canti = pro.getCant();
        System.out.println(canti);
        if(canti >= cantidad) {
            lista.setFila(indice);
            int cant = pro.getCant() - cantidad;
            venta.setCantidad(cantidad);
            System.out.println(venta.getCantidad());
            lista.getListaProducto().get(indice).setCant(cant);
            System.out.println(lista.getFila());
        }
        double descount = pro.getDescount();
        venta.setDecount(descount);
        venta.getSubTotal();
        temporal.add(venta);
        llenarTabla();
            JOptionPane.showMessageDialog(null, "No se encontro el producto", "Producto no encontrado", JOptionPane.ERROR_MESSAGE);
    }
    
    private Producto setBuscarProducto(String barcode) {
        Producto pro = new Producto();
        pro.setBarcode(barcode);
        int indice = Collections.binarySearch(lista.getListaProducto(), pro, Comparator.comparing(Producto :: getBarcode));
        if (indice >= 0) {
            this.indice = indice;
            return lista.getListaProducto().get(indice);
        }
        return null;
    }
    
    public void setCelda(int celda) {
        this.celda = celda;
    }
    
    public static int getCelda() {
        return celda;
    }
    
    
    public void eliminarProducto() {
        if(celda == -1) {
            JOptionPane.showMessageDialog(
                    null,
                    "seleccione la fila que quiere eliminar",
                    "fila no seleccionada",
                    JOptionPane.WARNING_MESSAGE
            );
        } else {
            int resp = JOptionPane.showConfirmDialog(
                null,
                "¿Estas seguro que quieres eliminar este producto?",
                "Eliminar",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
            );
            if(resp == JOptionPane.YES_OPTION) {
                lista.setEliminarProducto(celda);
                JOptionPane.showMessageDialog(
                    null,
                    "El producto se ha eliminado con exito",
                    "Eliminado",
                    JOptionPane.INFORMATION_MESSAGE
                );
                llenarTabla();
            } else {
                JOptionPane.showMessageDialog(
                    null,
                    "La eliminación de este producto se cancelo",
                    "Mensaje",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
        }
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
        // Todas las celdas no editables
        return false;
    }
}