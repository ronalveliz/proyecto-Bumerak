package Herencia.ConHerencia2;

public class Cliente extends Usuario {
    private boolean nuevo;
    private String comprasRealizadas;

    public Cliente(String dni, String correo, long telefono, boolean nuevo, String comprasRealizadas) {
        super(dni, correo, telefono);
        this.nuevo = nuevo;
        this.comprasRealizadas = comprasRealizadas;
    }

    public boolean isNuevo() {
        return nuevo;
    }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    public String getComprasRealizadas() {
        return comprasRealizadas;
    }

    public void setComprasRealizadas(String comprasRealizadas) {
        this.comprasRealizadas = comprasRealizadas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dni='" + getDni() + '\'' +
                "correo='" + getCorreo() + '\'' +
                "telefono='" + getTelefono() + '\'' +
                "nuevo=" + nuevo +
                ", comprasRealizadas='" + comprasRealizadas + '\'' +
                '}';
    }
}
