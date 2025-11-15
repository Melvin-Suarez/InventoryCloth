package controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Clientes;
import model.Producto;
import model.Ventas;

public class VentasController extends DefaultTableModel {
    
    private List<Ventas> temporal;
    private Listas lista = Listas.getInstance();
    private static int celda;
    private int indice = 0;
    private double total = 0;
    
    public VentasController() {
        super();
        temporal = new ArrayList<>();
        agregarColumnas();
    }
    
    
    
    public VentasController(boolean cliente) {
        super();
        temporal = new ArrayList<>();
        agregarTabla();
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
    private void agregarTabla() {
        this.setColumnCount(0);
        this.addColumn("Cliente");
        this.addColumn("Fecha de venta");
    }
    public void agregarHistorial() {
        this.setColumnCount(0);
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
                Double.toString(pro.getPrecio()) + " C$",
                Integer.toString(pro.getCantidad()),
                Double.toString(pro.getDecount() * 100).replace(".0", "") + "%",
                Double.toString(pro.getSubTotal()) + " C$"
            };
            
            this.addRow(renglon);
        }
        lista.ordenarLista();
    }
    public void llenarVenta(int fila) {
        // Limpiar la tabla antes de llenarla
        this.setRowCount(0);
        List<Ventas> rellenado = lista.getListaClientes().get(fila).getVendido();
        
        for(Ventas cli : rellenado) {
            String[] renglon = {
                cli.getBarcode(),
                cli.getMarca(),
                cli.getCategoria(),
                Double.toString(cli.getPrecio()) + " C$",
                Integer.toString(cli.getCantidad()),
                Double.toString(cli.getDecount() * 100).replace(".0", "") + "%",
                Double.toString(cli.getSubTotal()) + " C$"
            };
            
            this.addRow(renglon);
        }
        lista.ordenarLista();
    }
    
    public void llenarCliente() {
        // Limpiar la tabla antes de llenarla
        this.agregarTabla();
        this.setRowCount(0);
        
        for(Clientes cli : lista.getListaClientes()) {
            String[] renglon = {
                cli.getNombre(),
                cli.getFecha()
            };
            
            this.addRow(renglon);
        }
        lista.ordenarLista();
    }
    
    public void Agregar(String barcode, int cantidad) {
        lista.ordenarLista();
        Producto pro = setBuscarProducto(barcode);
        if(pro != null) {
        Ventas venta = new Ventas();
        venta.setBarcode(pro.getBarcode());
        venta.setMarca(pro.getMarca());
        venta.setCategoria(pro.getCategoria());
        venta.setPrecio(pro.getPrecio());
        
        
        if(pro.getCant() >= cantidad) {
            int cant = pro.getCant() - cantidad;
            venta.setCantidad(cantidad);
            
            lista.getListaProducto().get(indice).setCant(cant);
            if(verificarBarcode(barcode)) {
                int suma = temporal.get(indice).getCantidad();
                temporal.get(indice).setCantidad(cantidad + suma);
                total = CalcularTotal();
                llenarTabla();
                return;
            }
            
        } else {
            JOptionPane.showMessageDialog(
                null,
                "El stock disponible del producto es de " + pro.getCant(),
                "Stock insuficiente",
                JOptionPane.ERROR_MESSAGE
            );
            return;
        }
        double descount = pro.getDescount();
        venta.setDecount(descount);
        venta.getSubTotal();
        total = CalcularTotal() + venta.getSubTotal();
        temporal.add(venta);
        llenarTabla();
        }else {
            JOptionPane.showMessageDialog(
                null,
                "No se encontro el producto", "Producto no encontrado",
                JOptionPane.ERROR_MESSAGE
            );
        }
        
    }
    
    private Double CalcularTotal() {
        Double subTotal = 0.0;
        for(Ventas pro : temporal) {
            subTotal += pro.getSubTotal();
        }
        return subTotal;
    }
    
    public void VenderProducto() {
    Clientes cliente = new Clientes();
    int resp = JOptionPane.showConfirmDialog(
                    null,
                    "Desea confirmar esta venta?",
                    "Vender Producto",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
                );
    if(resp == JOptionPane.YES_OPTION) {
        String nombre = JOptionPane.showInputDialog(
                        null,
                        "Ingrese el nombre de cliente",
                        "Registrar Cliente",
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        null,
                        "Anonimo"
                    ).toString();
        if(nombre != null) {
            cliente.setNombre(nombre);
            cliente.setFecha(LocalDateTime.now());
            
            cliente.setVendido(new ArrayList<>(temporal));
            
            lista.getListaClientes().add(cliente);
            JOptionPane.showMessageDialog(null, "Productos vendidos con exito", "Producto", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "El stock actual de estos productos es de:\n" + generarReporteStock());
            this.setRowCount(0);
            temporal.clear(); // Limpiar después de vender
            llenarTabla();
        }
    }
}
    
    public void cancelarVenta() {
    // CAMBIO: Usar la lista temporal actual sin llamar a obtenerLista()
    if(!temporal.isEmpty()) {
        for(Ventas devolver : temporal) { // Usar temporal directamente
            String barcode = devolver.getBarcode();
            Producto pro = new Producto();
            pro.setBarcode(barcode);
            int indice = Collections.binarySearch(lista.getListaProducto(), pro, Comparator.comparing(Producto :: getBarcode));
            if(indice >= 0) {
                int cant = lista.getListaProducto().get(indice).getCant();
                lista.getListaProducto().get(indice).setCant(devolver.getCantidad() + cant);
            }
        }
    }
    temporal.clear();
    this.setRowCount(0); // Limpiar tabla
}
    
    private List<Ventas> obtenerLista() {
    List<Ventas> copia = new ArrayList<>();
    for(int fila = 0; fila < this.getRowCount(); fila++) {
        Ventas venderProducto = new Ventas();
        venderProducto.setBarcode(this.getValueAt(fila, 0).toString());
        venderProducto.setMarca(this.getValueAt(fila, 1).toString());
        venderProducto.setCategoria(this.getValueAt(fila, 2).toString());
        venderProducto.setPrecio(Double.parseDouble(this.getValueAt(fila, 3).toString()));
        venderProducto.setCantidad(Integer.parseInt(this.getValueAt(fila, 4).toString()));
        venderProducto.setDecount(Double.parseDouble(this.getValueAt(fila, 5).toString()));
        venderProducto.setSubTotal(Double.parseDouble(this.getValueAt(fila, 6).toString()));
        copia.add(venderProducto);
    }
    return copia;
}
    
    private boolean verificarBarcode(String barcode) {
        
        for(int fila = 0; fila < this.getRowCount(); fila++) {
            if(barcode.equals(this.getValueAt(fila, 0))) {
                indice = fila;
                return true;
            }
        }
        return false;
    }
    
    private String generarReporteStock() {
        StringBuilder reporte = new StringBuilder();
        
        for(Ventas generar : temporal) {
            Producto pro= setBuscarProducto(generar.getBarcode());
            String marca = pro.getMarca();
            int cantidad = pro.getCant();
            
            reporte.append(marca).append(": ")
                   .append(cantidad);
            
            if(cantidad <= 100) {
                reporte.append(" ⚠️ Stock Bajo");
            }
            reporte.append("\n");
        }
        return reporte.toString();
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
    
    
    public void eliminarProducto(int fila) {
        if(fila == -1) {
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
                JOptionPane.showMessageDialog(
                    null,
                    "El producto se ha eliminado con exito",
                    "Eliminado",
                    JOptionPane.INFORMATION_MESSAGE
                );
                setBuscarProducto(temporal.get(fila).getBarcode());
                int cant = lista.getListaProducto().get(indice).getCant();
                lista.getListaProducto().get(indice).setCant(cant + temporal.get(fila).getCantidad());
                temporal.remove(fila);
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

    public double getTotal() {
        total = 0;
        for(int fila = 0; fila < this.getRowCount(); fila++) {
            double subtotal = Double.parseDouble(this.getValueAt(fila, 6).toString().replace(" C$", ""));
            total += subtotal;
        }
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
        // Todas las celdas no editables
        return false;
    }
}