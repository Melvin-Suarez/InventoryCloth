package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Producto;

public class inventory extends DefaultTableModel {
    
    private static List<Producto> lista = new ArrayList();
    private int celda;
    
    public inventory() {
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
        
        for(Producto pro : lista) {
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
    }
    
    public void setCelda(int celda) {
        this.celda = celda;
    }
    
    public static void llenarLista(Producto pro) {
        lista.add(pro);
    }
    
    public void eliminarProducto() {
        if(celda == -1) {
            JOptionPane.showMessageDialog(
                    null,
                    "seleccione la fila que quiere editar",
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
                lista.remove(celda);
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
    
    public static List<Producto> getLista() {
        return lista;
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
        // Todas las celdas no editables
        return false;
    }
}