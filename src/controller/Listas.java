
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Clientes;
import model.Distribuidor;
import model.Producto;
import model.User;
import model.Ventas;

public class Listas {
    private static Listas instance;
    private List<User> listaUsuario;
    private List<Producto> listaProducto;
    private List<Ventas> listaVentas;
    private List<Distribuidor> listaDistribuidores;
    private List<Clientes> listaClientes;
    private String userName;
    private boolean isAdmin;
    private static int fila;

    public Listas() {
        this.listaUsuario = new ArrayList<>();
        this.listaProducto = new ArrayList<>();
        this.listaVentas = new ArrayList<>();
        this.listaDistribuidores = new ArrayList<>();
        this.listaClientes = new ArrayList<>();
        userName = "";
        isAdmin = false;
        listaUsuario.add(new User(true, "Admin", "12345678"));
        listaUsuario.add(new User(false,"melvin", "12345678"));
        listaUsuario.add(new User(false, "Aldo", "12345678"));
        listaUsuario.add(new User(false, "carlos", "12345678"));
        listaProducto.add(new Producto("000001", "Pengüin", "Camisa", "30", 0.1, 100.00, 10.00, 1000));
        listaProducto.add(new Producto("000000", "Levis", "Camisa", "20", 0.2, 1000, 2000, 2000));
        listaProducto.add(new Producto("000005", "Tommy", "Pantalon", "20", 0, 1000, 2000, 500));
        listaProducto.add(new Producto("000003", "Nice", "Zapatos", "20", 0.3, 1000, 2000, 1000));
        listaProducto.add(new Producto("000002", "Crocs", "Chinelas", "20", 0.5, 1000, 2000, 400));
        listaProducto.add(new Producto("000004", "Levis", "Pantalon", "20", 0.25, 1000, 2000, 600));
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

    public List<Ventas> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(List<Ventas> listaVentas) {
        this.listaVentas = listaVentas;
    }

    public List<Distribuidor> getListaDistribuidores() {
        return listaDistribuidores;
    }

    public void setListaDistribuidores(List<Distribuidor> listaDistribuidores) {
        this.listaDistribuidores = listaDistribuidores;
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

    public List<Clientes> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Clientes> listaClientes) {
        this.listaClientes = listaClientes;
    }
    
    
    
}
