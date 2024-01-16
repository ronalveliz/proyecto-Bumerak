package Encapsulacion;

public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo();
        v1.setVelicidad(100);
        v1.setVelicidad(200);


        System.out.println(v1.getModelo());
        v1.setModelo("BMW");
        v1.setTipo("Terrestre");
    }
}