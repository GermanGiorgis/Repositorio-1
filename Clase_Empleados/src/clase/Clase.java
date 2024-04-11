
package clase;

public class Clase {

    public static void main(String[] args) {
        
        Empleados e1 = new Empleados("1", "1", "1", "1", "1", 1.2);

        Acciones n2 = new Acciones();
        n2.CalcularEdad();
        n2.MostrarDatos();
        
        e1.toString();
       
    }
    
}
