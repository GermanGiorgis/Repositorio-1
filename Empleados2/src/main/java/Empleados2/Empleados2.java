
package Empleados2;


public class Empleados2 {
    private String DNI;
    private String Nombre;
    private String Apellido;
    private String Fecha;
    private String Domicilio;
    private double Sueldo;

    public Empleados2() {
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    @Override
    public String toString() {
        return "Empleados2{" + "DNI=" + DNI + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Fecha=" + Fecha + ", Domicilio=" + Domicilio + ", Sueldo=" + Sueldo + '}';
    }
    
    
    
    
    
    }

