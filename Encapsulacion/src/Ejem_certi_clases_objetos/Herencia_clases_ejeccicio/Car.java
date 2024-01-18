package Ejem_certi_clases_objetos.Herencia_clases_ejeccicio;

public class Car extends Vehicle {
    private String model;



    public Car(String brand, int speed, String type, String model) {
        super(brand, speed, type);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
