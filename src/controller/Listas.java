
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Producto;
import model.User;

public class Listas {
    private static Listas instance;
    private List<User> listaUsuario;
    private List<Producto> listaProducto;
    private String userName;
    private boolean isAdmin;
    private static int fila;

    public Listas() {
        this.listaUsuario = new ArrayList<>();
        this.listaProducto = new ArrayList<>();
        userName = "";
        isAdmin = false;
        listaUsuario.add(new User(true, "Admin", "12345678"));
        listaUsuario.add(new User(false,"melvin", "12345678"));
        listaUsuario.add(new User(false, "Aldo", "12345678"));
        listaUsuario.add(new User(false, "carlos", "12345678"));
        listaProducto.add(new Producto("000001", "Pengüin", "Pantalon", "30", 0.1, 100.00, 10.00, 12));
        listaProducto.add(new Producto("000000", "Levis", "Camisa", "20", 0, 1000, 2000, 10));
        listaProducto.add(new Producto("000005", "Levis", "Camisa", "20", 0, 1000, 2000, 10));
        listaProducto.add(new Producto("000003", "Levis", "Camisa", "20", 0, 1000, 2000, 10));
        listaProducto.add(new Producto("000002", "Levis", "Camisa", "20", 0, 1000, 2000, 10));
        listaProducto.add(new Producto("000004", "Levis", "Camisa", "20", 0, 1000, 2000, 10));
        fila = -1;
    }
    
    public static Listas getInstance() {
        if(instance == null) {
            instance = new Listas();
        }
        return instance;
    }
    
    public void obtenerUsuario(User usuario) {
        this.userName = usuario.getNombre();
        this.isAdmin = usuario.isAdmin();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    
    
    
    public void setAgregarUsuario(User usuario) {
        this.listaUsuario.add(usuario);
    }
    
    public void setEliminarUsuario(User usuario) {
        this.listaUsuario.remove(usuario);
    }
    
    public void setEditarUsuario(int indice, String usuario, String contra) {
        listaUsuario.get(indice).setNombre(usuario);
        listaUsuario.get(indice).setContraseña(contra);
    }
    
    public void setAgregaProducto(Producto pro) {
        this.listaProducto.add(pro);
    }
    
    public void setEliminarProducto(int indice) {
        this.listaProducto.remove(indice);
    }

    public List<User> getListaUsuario() {
        return listaUsuario;
    }

    public List<Producto> getListaProducto() {
        return listaProducto;
    }
    
     
   public boolean setEditarProducto(
                String barcode,
                String marca,
                String categoria,
                String talla,
                String descount,
                String compra,
                String precio,
                String cant
            ) {
              
       if(VerificarIngresos(precio, cant, descount, compra)) {
           
        listaProducto.get(fila).setBarcode(barcode);
        listaProducto.get(fila).setMarca(marca);
        listaProducto.get(fila).setCategoria(categoria);
        listaProducto.get(fila).setTalla(talla);
        double descuento = Double.parseDouble(descount);
        listaProducto.get(fila).setDescount(descuento);
        listaProducto.get(fila).setCompra(Double.parseDouble(compra));
        listaProducto.get(fila).setPrecio(Double.parseDouble(precio));
        listaProducto.get(fila).setCant(Integer.parseInt(cant));
        return true;
        
       }
        
       return false;
       
    }
   
   private boolean VerificarIngresos(String price, String cantidad, String descuento, String compras) {
       
       double ingresos;
       double precio = Double.parseDouble(price);
       int cant = Integer.parseInt(cantidad);
       double descount = Double.parseDouble(descuento);
       double compra = Double.parseDouble(compras);
       
       if(descount > 1) {
            descount /= 100;
            double precioConDescuento = precio - (precio * descount);
            double calculando = (cant * precioConDescuento) - compra;
            ingresos = calculando;
        }else {
            double precioConDescuento = precio - (precio * descount);
            double calculando = (cant * precioConDescuento) - compra;
            ingresos = calculando;
        }
       
        if(ingresos <= 0) {
            int resp = JOptionPane.showConfirmDialog(
                    null,
                "Los ingresos de este producto son menores o iguales a cero\n" +
                "Se recomienda que suba el precio\n" +
                "¿Aun asi desea guardar los cambios para este producto?",
                "Advertencia",
                JOptionPane.YES_NO_OPTION,  JOptionPane.WARNING_MESSAGE
            );
            
            if(resp == JOptionPane.NO_OPTION) {
                return false;
            }
        }
        return true;
   }
   
   public void ordenarLista() {
       listaProducto.sort((p1, p2) -> p1.getBarcode().compareTo(p2.getBarcode()));
   }
   
    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }
    
   
    
}
