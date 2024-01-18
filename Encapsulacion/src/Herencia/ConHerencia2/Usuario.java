package Herencia.ConHerencia2;

public class Usuario {
    private String dni;
    private String correo;
    private long telefono;

    public Usuario(String dni, String correo, long telefono) {
        this.dni = dni;
        this.correo = correo;
        this.telefono = telefono;
    }
// set y get
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "dni='" + dni + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
