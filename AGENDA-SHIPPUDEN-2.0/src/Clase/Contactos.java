
package Clase;


public class Contactos {
    int DNI;//ID
    int Celular;
    String Nombres;
    String Apellidos;
    String Mail;
    public Contactos() {
    }
    public Contactos(int DNI, int Celular, String Nombres, String Apellidos, String Mail) {
        this.DNI = DNI;
        this.Celular = Celular;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Mail = Mail;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getCelular() {
        return Celular;
    }

    public void setCelular(int Celular) {
        this.Celular = Celular;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

}