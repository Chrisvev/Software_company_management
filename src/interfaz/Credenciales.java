
package interfaz;

/**
 *
 * @author chris
 */
public abstract class Credenciales {
    
    
    public abstract void CompararCredenciales();
        
    

    public String getUsu() {
        return usu;
    }

    public String getContra() {
        return contra;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public boolean inicio = false;
    public int cerrar = 1;
    private final String usu = "Chris";
    private final String contra = "1234";
    private String usuario = "";
    private String contrasena = "";
}
