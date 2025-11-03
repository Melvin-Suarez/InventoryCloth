package Modelo;

import javax.swing.table.DefaultTableModel;

public class TablaModelo extends DefaultTableModel {
    public static TablaModelo modelo;
    
    static {
        modelo = new TablaModelo();
        modelo.addColumn("Codigo de barra");
        modelo.addColumn("Marca");
        modelo.addColumn("Categoria");
        modelo.addColumn("Talla");
        modelo.addColumn("Descuento");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Total");
        
    }
    
    public TablaModelo() {
        super();
    }
    
    public static TablaModelo getModelo() {
        return modelo;
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
        // Todas las celdas no editables
        return false;
    }
}