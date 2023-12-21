package Bumerak.Estruc_Control;

import java.util.Scanner;

public class Switch_mejorado {


    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("introduce un mumero del 1 al 7  -- dia de la semana--");

        int weekDay = scanner.nextInt();

        switch (weekDay){
            case 1 -> System.out.println("lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("valor incorrecto");



        }
    }
}
