package model;

public class Producto {
    private String Barcode;
    private String Marca;
    private String categoria;
    private String talla;
    private double descount;
    private double precio;
    private int cant;
    private double total;

    public Producto(String Barcode, String Marca, String categoria, String talla, double descount, double precio, int cant) {
        this.Barcode = Barcode;
        this.Marca = Marca;
        this.categoria = categoria;
        this.talla = talla;
        this.descount = descount;
        this.precio = precio;
        this.cant = cant;
        calcularTotal();
    }

    public Producto() {
        
    }

    // Método para calcular el total
    private void calcularTotal() {
        double precioConDescuento = precio - (precio * descount);
        this.total = precioConDescuento * cant;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getBarcode() {
        return Barcode;
    }

    public void setBarcode(String Barcode) {
        this.Barcode = Barcode;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public double getDescount() {
        return descount;
    }

    public void setDescount(double descount) {
        this.descount = descount;
        calcularTotal(); // Recalcular cuando cambia el descuento
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
        calcularTotal(); // Recalcular cuando cambia el precio
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
        calcularTotal(); // Recalcular cuando cambia la cantidad
    }

    public double getTotal() {
        return total;
    }

    // Métodos para la tabla (sin lógica de cálculo)
    public String getDescountT() {
        return String.format("%.0f", descount * 100) + "%";
    }
    
    public String getPrecioT() {
        return String.format("%.2f", precio);
    }
    
    public String getCantT() {
        return Integer.toString(cant);
    }
    
    public String getTotalT() {
        return String.format("%.2f", total);
    }
}