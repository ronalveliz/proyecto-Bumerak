package Herencia.ConHerencia2;

public class Empleados extends Usuario{
    private int empleado;
    private long sueldo;
    private boolean trabaja;
    private boolean descansa;

    public Empleados(String dni, String correo, long telefono, int empleado, long sueldo, boolean trabaja, boolean descansa) {
        super(dni, correo, telefono);
        this.empleado = empleado;
        this.sueldo = sueldo;
        this.trabaja = trabaja;
        this.descansa = descansa;
    }

    public int getEmpleado() {
        return empleado;
    }

    public void setEmpleado(int empleado) {
        this.empleado = empleado;
    }

    public long getSueldo() {
        return sueldo;
    }

    public void setSueldo(long sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isTrabaja() {
        return trabaja;
    }

    public void setTrabaja(boolean trabaja) {
        this.trabaja = trabaja;
    }

    public boolean isDescansa() {
        return descansa;
    }

    public void setDescansa(boolean descansa) {
        this.descansa = descansa;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "empleado=" + empleado +
                ", sueldo=" + sueldo +
                ", trabaja=" + trabaja +
                ", descansa=" + descansa +
                "} " + super.toString();
    }
}
