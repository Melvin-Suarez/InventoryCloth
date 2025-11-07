package controller;

import javax.swing.JOptionPane;

public class Login {
    public static boolean verificar(String usuario, String contrasenia) {
        if(usuario.equals("admin")) {
            if(contrasenia.equals("84933756")) {
                return true;
            }else {
                JOptionPane.showConfirmDialog(null, "Su contraseña es incorrecta por favor vuelva a intentarlo", "Error: Contrasña Incorrecta",JOptionPane.ERROR_MESSAGE);
            }
        }else {
            JOptionPane.showConfirmDialog(null, "Su Usuario no ha sido encontrado", "Error: Usuario no encontrado",JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
}
