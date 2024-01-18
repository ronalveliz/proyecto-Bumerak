package Ejem_certi_clases_objetos.clases_objetos_ejercicio;

import Ejem_certi_clases_objetos.clases_objetos_ejercicio.Car;

public class main {
    public static void main(String[] args) {
        Car miCarro = new Car("Toyota", "Corolla", 2020);
        System.out.println(miCarro.getBrand());  // Debe imprimir "Toyota"
        System.out.println(miCarro.getModel());  // Debe imprimir "Corolla"
        System.out.println(miCarro.getYear());   // Debe imprimir 2020

        miCarro.setBrand("Ford");
        System.out.println(miCarro.getBrand());  // Debe imprimir "Ford"
    }
}
