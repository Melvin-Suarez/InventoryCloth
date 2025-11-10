package model;

public class Producto {
    private String Barcode;
    private String Marca;
    private String categoria;
    private String talla;
    private double descount;
    private double compra;
    private double precio;
    private int cant;
    private double ingresos;

    public Producto(String Barcode, String Marca, String categoria, String talla, double descount, double compra, double precio, int cant) {
        this.Barcode = Barcode;
        this.Marca = Marca;
        this.categoria = categoria;
        this.talla = talla;
        this.compra = compra;
        this.precio = precio;
        this.cant = cant;
        calcularIngresos();
    }

    public Producto() {
        
    }

    // Método para calcular el ingresos
    private void calcularIngresos() {
        if(descount >= 1) {
            descount /= 100;
            double precioConDescuento = precio - (precio * descount);
            double calculando = (cant * precioConDescuento) - compra;
            this.ingresos = calculando;
        }else {
            double precioConDescuento = precio - (precio * descount);
            double calculando = (cant * precioConDescuento) - compra;
            this.ingresos = calculando;
        }
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
        calcularIngresos(); // Recalcular cuando cambia el descuento
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
        calcularIngresos(); // Recalcular cuando cambia el precio
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
        calcularIngresos(); // Recalcular cuando cambia la cantidad
    }

    public double getTotal() {
        return ingresos;
    }

    public double getCompra() {
        return compra;
    }

    public void setCompra(double compra) {
        this.compra = compra;
        calcularIngresos();
    }

    public double getIngresos() {
        calcularIngresos();
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    
    
    // Métodos para la tabla (sin lógica de cálculo)
    public String getCompraT() {
        return String.format("%.2f", compra) + " C$";
    }
    
    public String getDescountT() {
        if(descount < 1) descount *= 100;
        return String.format("%.0f", descount) + "%";
    }
    
    public String getPrecioT() {
        return String.format("%.2f", precio) + " C$";
    }
    
    public String getCantT() {
        return Integer.toString(cant);
    }
    
    public String getTotalT() {
        return String.format("%.2f", ingresos) + " C$";
    }
}