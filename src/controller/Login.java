package controller;

import javax.swing.JOptionPane;
import model.User;
import view.MenuPrincipal;
import view.MenuUsuario;

public class Login {

    // con minuscula
    private Listas lista;
    private String nombre = "";

    public Login() {
        lista = Listas.getInstance();
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public boolean verificar(User usuario) {
        for (User user : lista.getListaUsuario()) {
            if (usuario.getNombre().equals(user.getNombre())) {
                if (usuario.getContraseña().equals(user.getContraseña())) {
                    JOptionPane.showMessageDialog(null, "Has iniciado sesión correctamente", "Login", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println(user.getNombre());
                    setNombre(user.getNombre());
                    IniciarCargo(user.isAdmin());
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Su contraseña es incorrecta por favor vuelva a intentarlo", "Error: Contrasña Incorrecta", JOptionPane.ERROR_MESSAGE);
                    return false; 
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Su Usuario no ha sido encontrado", "Error: Usuario no encontrado", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    public void IniciarCargo(boolean cargo) {
        if(cargo) {
            new MenuPrincipal().setVisible(true);
            return;
        } else {
            new MenuUsuario().setVisible(true);
        }
    }
    
    
    
    public boolean compararUsuarioCon(User usuario) {
        for (User user : lista.getListaUsuario()) {
            if (usuario.getNombre().equals(user.getNombre())) {
                JOptionPane.showMessageDialog(null, "Este Usuario ya existe", "Error: Usuario existente", JOptionPane.ERROR_MESSAGE);
                    return false;
            }
        }
        return true;
    }

}
