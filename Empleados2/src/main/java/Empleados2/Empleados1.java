

package Empleados2;

import java.util.Scanner;


public class Empleados1 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        Empleados2 Persona_1= new Empleados2();
        Persona_1.setNombre("German");
        Persona_1.setApellido("Giorgis");
        Persona_1.setDNI("41191392");
        Persona_1.setDomicilio("Calle San Telmo");
        Persona_1.setFecha("1998-05-22");
        Persona_1.setSueldo(100.000);
        
     //Llamo al metodo toString para mostrar los datos por consola
     // System.out.println(Persona_1.toString());
      AccionesEmpleados A1 = new AccionesEmpleados();
      A1.CalcularEdad(Persona_1);
      AccionesEmpleados A2 = new AccionesEmpleados();
      A2.MostrarDatos(Persona_1);
}
}
