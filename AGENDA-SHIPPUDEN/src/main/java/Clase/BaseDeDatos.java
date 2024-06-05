
package Clase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class BaseDeDatos {
    
    private static final String URL= "jdbc:mysql://%/agendapersonas";
    private static final String USER= "Ger";
    private static final String PASSWORD="123";
    
    public static Connection getConnection(){
        Connection c=null;
        try {
            c=DriverManager.getConnection(URL,USER,PASSWORD);
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexion fallada "+e.getMessage());
            
        }
        return c;
    }
    
}
