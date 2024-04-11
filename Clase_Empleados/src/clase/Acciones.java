
package clase;
import java.time.LocalDate;
import java.time.Period;

public class Acciones {
    
    Empleados n1 = new Empleados();
    
    public void CalcularEdad(){
        LocalDate fechaN=LocalDate.parse(n1.getFechNac());
        LocalDate fechaAct=LocalDate.now();
        Period periodo = Period.between(fechaN, fechaAct);
        int edad = periodo.getYears();
        System.out.println(edad);
    }
    
    public void MostrarDatos(){
        System.out.println(n1.getNombre());
        System.out.println(n1.getApellido());
        System.out.println(n1.getDNI());
        System.out.println(n1.getDomicilio());
        System.out.println(n1.getSueldBruto());
        System.out.println("i´m giorgis el poderoso");
    }
}
