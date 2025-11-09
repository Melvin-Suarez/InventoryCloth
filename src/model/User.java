
package model;


public class User {
 private boolean Admin;
 private String Nombre;
 private String Contraseña;
 
    public User() {
    }

    public User(boolean Admin, String Nombre, String Contraseña) {
        this.Admin = Admin;
        this.Nombre = Nombre;
        this.Contraseña = Contraseña;
    }
    public User(String Nombre, String Contraseña) {
        this.Nombre = Nombre;
        this.Contraseña = Contraseña;
    }

    public boolean isAdmin() {
        return Admin;
    }

    public void setAdmin(boolean Admin) {
        this.Admin = Admin;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    
    
 
 
}
