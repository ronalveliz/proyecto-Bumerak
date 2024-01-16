package Telefono_movil;

public class TelefonoMovil {
    String fabricante;
    String modelo;
    int numcore;
    int ram;
    boolean encendido;
    double precio;

    public TelefonoMovil() {
    }

    public TelefonoMovil(String fabricante, String modelo, int numcore, int ram, boolean encendido, double precio) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.numcore = numcore;
        this.ram = ram;
        this.encendido = encendido;
        this.precio = precio;
    }

    public  void encender(){
        if (this.numcore > 0 && this.ram >0) {
            this.encendido = true;
        }
    }




    @Override
    public String toString() {
        return "TelefonoMovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numcore=" + numcore +
                ", ram=" + ram +
                ", encendido=" + encendido +
                ", precio=" + precio +
                '}';
    }
}
