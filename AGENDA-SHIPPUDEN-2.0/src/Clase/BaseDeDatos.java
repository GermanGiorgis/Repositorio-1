
package Clase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class BaseDeDatos {
    
    private static final String URL= "jdbc:mysql://localhost/agendapersonas";
    private static final String USER= "root";
    private static final String PASSWORD="";
    
    public static Connection getConnection(){
        Connection c=null;
        try {
            c=DriverManager.getConnection(URL,USER,PASSWORD);
            //JOptionPane.showMessageDialog(null, "Conexion exitosa");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexion fallada "+e.getMessage());
            
        }
        return c;
    }
    
}
