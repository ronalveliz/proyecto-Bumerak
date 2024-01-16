package Encapsulacion;

import java.util.List;

public class Vehiculo {
    private String tipo;
    private String modelo;
    private int velicidad;
    private double peso;
    private List<String> modelosdisponiblles = List.of(
            "BMW",
            "Mercedes",
            "Audi"
    );
     private List<String> tipoVehiculo = List.of(
             "Terrestre",
             "Acuatico",
             "Aereo"
     );
    public Vehiculo() {
    }

    public Vehiculo(String modelo, int velicidad, double peso) {
        this.modelo = modelo;
        this.velicidad = velicidad;
        this.peso = peso;

    }

// metodo getter y setter

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        for(String tipoVehiculos : tipoVehiculo){
            if (tipo.contains(tipoVehiculos)){
                System.out.println("Tipo disponible");
                break;
            }
            else{
                System.out.println("tipo no disponoble");
            }
            this.tipo = tipo;

        }

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
       if (modelosdisponiblles.contains(modelo)){
           System.out.println("modelo disponible");
       }
       else{
           System.out.println("modelo incorrecto");
       }

        this.modelo = modelo;
    }

    public int getVelicidad() {
        return velicidad;
    }

    public void setVelicidad(int velicidad) {
        if (this.velicidad > 0 && this.velicidad < 120 ){}
        this.velicidad = velicidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // metodo toString
    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", velicidad=" + velicidad +
                ", peso=" + peso +
                '}';
    }
}
