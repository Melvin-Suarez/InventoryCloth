package controller;

import javax.swing.JOptionPane;

public class Login {
    public static boolean verificar(String usuario, String contrasenia) {
        if(usuario.equals("Admin")) {
            if(contrasenia.equals("12345678")) {
                return true;
            }else {
                JOptionPane.showMessageDialog(null, "Su contraseña es incorrecta por favor vuelva a intentarlo", "Error: Contrasña Incorrecta",JOptionPane.ERROR_MESSAGE);
            }
        }else {
            JOptionPane.showMessageDialog(null, "Su Usuario no ha sido encontrado", "Error: Usuario no encontrado",JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
}
