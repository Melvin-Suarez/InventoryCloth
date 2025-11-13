package model;

public class Ventas {
    private String barcode;
    private String marca;
    private String categoria;
    private double precio;
    private int cantidad;
    private double descount;
    private double subTotal;

    public Ventas() {
    }

    public Ventas(String barcode, String marca, String categoria, double precio, int cantidad, double decount, double subTotal) {
        this.barcode = barcode;
        this.marca = marca;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;
        this.descount = decount;
        this.subTotal = subTotal;
    }
    
    private void Calcular() {
        double precioDescuento = precio - (precio * descount);
        this.subTotal = precioDescuento * cantidad;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getDecount() {
        return descount;
    }

    public void setDecount(double decount) {
        this.descount = decount;
    }

    public double getSubTotal() {
        Calcular();
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

}
