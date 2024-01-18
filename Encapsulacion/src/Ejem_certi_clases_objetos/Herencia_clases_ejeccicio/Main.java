package Ejem_certi_clases_objetos.Herencia_clases_ejeccicio;

public class Main {
    public static void main(String[] args) {
        Vehicle vehiculo = new Vehicle("Toyota", 120, "Sedan");
        System.out.println(vehiculo.getBrand());  // Debe imprimir "Toyota"

        Car coche = new Car("Ford", 180, "SUV", "Explorer");
        System.out.println(coche.getModel());  // Debe imprimir "Explorer"
    }
}
