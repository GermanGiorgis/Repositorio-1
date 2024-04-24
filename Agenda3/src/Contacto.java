class Contacto {
    private String nombre;
    private String apellido;
    private String dni;
    private String mail;

    public Contacto(String nombre, String apellido, String dni, String mail) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", DNI: " + dni + ", Mail: " + mail;
    }
}
