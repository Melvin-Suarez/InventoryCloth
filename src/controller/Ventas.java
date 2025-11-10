package controller;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Producto;
import view.formulario;

public class Ventas extends DefaultTableModel {
    
    private Listas lista = Listas.getInstance();
    private static int celda;
    
    public Ventas() {
        super();
        agregarColumnas();
    }
    
    private void agregarColumnas() {
        this.addColumn("Codigo de barra");
        this.addColumn("Marca");
        this.addColumn("Categoria");
        this.addColumn("Talla");
        this.addColumn("Descuento");
        this.addColumn("Precio");
        this.addColumn("Cantidad");
        this.addColumn("Total");
    }
    
    public void llenarTabla() {
        // Limpiar la tabla antes de llenarla
        this.setRowCount(0);
        
        for(Producto pro : lista.getListaProducto()) {
            String[] renglon = {
                pro.getBarcode(),
                pro.getMarca(),
                pro.getCategoria(),
                pro.getTalla(),
                pro.getDescountT(),
                pro.getPrecioT(),
                pro.getCantT(),
                pro.getTotalT()
            };
            
            this.addRow(renglon);
        }
        lista.ordenarLista();
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
    
    public void editarTabla() {
        if(celda == -1) {
            JOptionPane.showMessageDialog(
                    null,
                    "seleccione la fila que quiere editar",
                    "fila no seleccionada",
                    JOptionPane.WARNING_MESSAGE
            );
        } else {
            String barcode = (String) this.getValueAt(celda, 0);
            String marca = (String) this.getValueAt(celda, 1);
            String categoria = (String) this.getValueAt(celda, 2);
            String talla = (String) this.getValueAt(celda, 3);
            String descount = this.getValueAt(celda, 4).toString();
            int descuento = Integer.parseInt(descount.replace("%", ""));
            String compra = this.getValueAt(celda, 5).toString();
            compra = compra.replace(" C$", "");
            String precio = (String) this.getValueAt(celda, 6);
            precio = precio.replace(" C$", "");
            String cantidad = (String) this.getValueAt(celda, 7);
            formulario.txtCodigo.setText(barcode);
            formulario.txtMarca.setText(marca);
            formulario.txtCategoria.setText(categoria);
            formulario.txtTalla.setText(talla);
            formulario.spinner.setValue(descuento);
            formulario.txtcompra.setText(compra);
            formulario.txtPrecio.setText(precio);
            formulario.txtCantidad.setText(cantidad);
        }
        //return false;
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
        // Todas las celdas no editables
        return false;
    }
}