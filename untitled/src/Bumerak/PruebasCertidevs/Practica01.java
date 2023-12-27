package Bumerak.PruebasCertidevs;

import java.util.Scanner;

public class Practica01 {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Introdusca un numero + o -: ");
        int numero = scanner.nextInt();

        if (numero >= 1 ) {
            System.out.println("el "+numero + " es: PAR");
        }
        else if (numero == 0) {
            System.out.println("El "+numero + " es: neutro");
        } else {
            System.out.println("El "+ numero+ " es: Impar");
        }
        System.out.println("Escribe un numero  del 1 a 7 para elegir un dia de la semana");

        int diaDeLaSemana = scanner.nextInt();
        switch (diaDeLaSemana) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("valor incorrecto");

        }

            for (int numeroPar = 0; numeroPar < 20; numeroPar +=2 )  {
                System.out.println("Estos son los 10 primeros numero pares: " + numeroPar);
            }



    }
}
