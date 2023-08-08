package main;

import interfaz.Credenciales;
import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class Login extends Credenciales {

    @Override
    public void CompararCredenciales() {
        inicio = getUsuario().equalsIgnoreCase(getUsu()) && getContrasena().equals(getContra());
        if (inicio == false) {
            JOptionPane.showMessageDialog(null, "Datos Incorrectos", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            inicio = true;
            JOptionPane.showMessageDialog(null, "Iniciando sesion", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
