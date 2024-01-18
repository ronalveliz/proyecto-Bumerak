package Herencia.ConHerencia;

public class Main {
    public static void main(String[] args) {
        Vehiculo toyota = new Vehiculo("toyota","modelo1",3);
        Bicicleta bici = new Bicicleta("lambo","aventure",3,"carbono55",true,true);

        System.out.println(toyota.toString());
        System.out.println(bici.toString());

    }
}
