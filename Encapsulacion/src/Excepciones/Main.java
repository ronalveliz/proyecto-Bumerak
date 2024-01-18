package Excepciones;

public class Main {
    public static void main(String[] args) {
        try {
            int resultado = 5/0 ;
        } catch (Exception e) {
            System.out.println("Division incorrecta");;
        }
        System.out.println("continuamos");
    }

}
