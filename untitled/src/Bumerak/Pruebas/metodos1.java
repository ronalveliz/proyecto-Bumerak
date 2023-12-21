package Bumerak.Pruebas;

import java.util.Scanner;

public class metodos1 {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int edad = readInt("Introduce edad");
        int numhijos = readInt("Introduce numero de hijos");


    }

    private static int readInt(String prompt) {
        System.out.println(prompt);
        int numero = scanner.nextInt();
        return numero;
    }
}
