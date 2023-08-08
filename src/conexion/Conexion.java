
package conexion;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author chris
 */
public class Conexion {
         public static java.sql.Connection conectar() {
        try {
            java.sql.Connection cn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/paqueteria", "root", "");
            System.out.println("Conectado con Exito");
            return cn;
        } catch (SQLException e) {
            System.err.println("Error en la conexión local " + e);
        }
        return (null);
    }
}
