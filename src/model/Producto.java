package model;

public class Producto {
    private String Barcode;
    private String Marca;
    private String talla;
    private double descount;
    private double precio;
    private int cant;
    private int total;

    public Producto(String Barcode, String Marca, String talla, double descount, double precio, int cant, int total) {
        this.Barcode = Barcode;
        this.Marca = Marca;
        this.talla = talla;
        this.descount = descount;
        this.precio = precio;
        this.cant = cant;
        this.total = total;
    }

    public Producto() {
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
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
}
