package Ejercicios;
import java.util.Scanner;

public class Main {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int numero1 = readInt("Introduce numero");
        int numero2 = readInt("Introduce numero");
        int resultado1 = suma(numero1,numero2);
        System.out.println(resultado1);
        int numero3 = readInt("Introduce numero");
        long resultado2 = factorial(numero3);
        System.out.println("el factorial de :" + numero3 + " es " + resultado2);
        String saludo = " ronald ";
        saludoPersonalizado(saludo);
        System.out.println("¿El numero " + numero3 + " es par?");
        boolean resultado4 = esPar(numero3);



    }

    private static boolean esPar(int numero3) {
        System.out.println(numero3 % 2 == 0);
        return true;
    }


    private static void saludoPersonalizado(String saludo) {
         System.out.println("hola " + saludo + "candidato numero #563683");

    }

    private static long factorial(int numero3) {
        if(numero3 == 0 || numero3 == 1){
            return 1;
        }
        else {
            return numero3 * factorial(numero3-1);
        }
    }

    private static int suma(int numero1, int numero2) {
        int resultado = numero1+numero2;
        return resultado;
    }

    private static int readInt(String prompt) {
        System.out.println(prompt);
        return scanner.nextInt();
    }

}
