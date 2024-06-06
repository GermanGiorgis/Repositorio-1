
package Agenda;

import Clase.BaseDeDatos;
import java.sql.Connection;


public class Main {

   
    public static void main(String[] args) {
        
        Connection n2 = BaseDeDatos.getConnection();
        
        Logear L = new Logear();
        L.setVisible(true);
        L.setLocationRelativeTo(null);
        L.setTitle("Aagenda Shippuden");
        
    }
    
}
