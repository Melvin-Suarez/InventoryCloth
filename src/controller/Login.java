package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.User;

public class Login {
    
     // con minuscula 
 private List<User> lista = new ArrayList<>();

    public Login() {
        lista.add(new User(true, "Admin", "12345678"));
    }
 
 
 
    public List<User> getLista() {
        return lista;
    }
    
    public void setLista(User usuario) {
        this.lista.add(usuario);
    }
    
    public boolean verificar(User usuario) {
        for(User user : lista) {
        if(usuario.getNombre().equals(user.getNombre())) {
            if(usuario.getContraseña().equals(user.getContraseña())) {
                return true;
            }else {
                JOptionPane.showMessageDialog(null, "Su contraseña es incorrecta por favor vuelva a intentarlo", "Error: Contrasña Incorrecta",JOptionPane.ERROR_MESSAGE);
            }
        }else {
            JOptionPane.showMessageDialog(null, "Su Usuario no ha sido encontrado", "Error: Usuario no encontrado",JOptionPane.ERROR_MESSAGE);
        }
        }
        JOptionPane.showMessageDialog(null, "Su Usuario no ha sido encontrado", "Error: Usuario no encontrado",JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    
}
