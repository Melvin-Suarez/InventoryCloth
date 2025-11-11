package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Distribuidor;
import view.formularioProveedores;

public class Distribuidores extends DefaultTableModel {
    
    private static List<Distribuidor> lista = new ArrayList();
    private static int celda;
    
    public Distribuidores() {
        super();
        agregarColumnas();
    }
    
    private void agregarColumnas() {
        this.addColumn("Nombre");
        this.addColumn("Correo electronico");
        this.addColumn("Telefono");
        this.addColumn("Categoria");
        
    }
    
    public void llenarTabla() {
        // Limpiar la tabla antes de llenarla
        this.setRowCount(0);
        
        for(Distribuidor pro : lista) {
            String[] renglon = {
                pro.getNombre(),
                pro.getCorreo(),
                pro.getTelefono(),
                pro.getCategoria(),
               
            };
            
            this.addRow(renglon);
        }
    }
    
    public void setCelda(int celda) {
        this.celda = celda;
    }
    
    public static int getCelda() {
        return celda;
    }
    
    public static void llenarLista(Distribuidor pro) {
        lista.add(pro);
    }
    
    public void eliminarDistribuidor() {
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
    
    public void editarTabla() {
        if(celda == -1) {
            JOptionPane.showMessageDialog(
                    null,
                    "seleccione la fila que quiere eliminar",
                    "fila no seleccionada",
                    JOptionPane.WARNING_MESSAGE
            );
        } else {
            String Nombre = (String) this.getValueAt(celda, 0);
            String Correo = (String) this.getValueAt(celda, 1);
            String Telefono = (String) this.getValueAt(celda, 2);
            String Categoria = (String) this.getValueAt(celda, 3);
           
            
            formularioProveedores.txtNombre.setText(Nombre);
            formularioProveedores.txtCorreo.setText(Correo);
            formularioProveedores.txtTelefono.setText(Telefono);
            formularioProveedores.txtCategoria.setText(Categoria);
          
        }
    }
    
    public static List<Distribuidor> getLista() {
        return lista;
    }
    
    public static void setLista(List<Distribuidor> list) {
        lista = list;
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
        // Todas las celdas no editables
        return false;
    }
}