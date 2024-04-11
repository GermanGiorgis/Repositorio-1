package Empleados2;

import java.time.LocalDate;
import java.time.Period;

public class AccionesEmpleados {

    public void CalcularEdad(Empleados2 e) {
        LocalDate fechaN = LocalDate.parse(e.getFecha());
        LocalDate fechaAct = LocalDate.now();
        Period periodo = Period.between(fechaN, fechaAct);
        int edad = periodo.getYears();
        System.out.println(edad);
    }
    public void MostrarDatos(Empleados2 e){
        System.out.println(e.getNombre());
        System.out.println(e.getApellido());
        System.out.println(e.getDNI());
        System.out.println(e.getDomicilio());
        System.out.println(e.getSueldo());
        
        
    }

}
