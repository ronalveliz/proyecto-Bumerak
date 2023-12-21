package Bumerak.Estruc_Control;

public class IfElse {
    public static void main(String[] args) {
        double precio = 56.55;

        if (precio >50) {
            System.out.println("Gastos de envio gratis");
        }
        else{
            System.out.println("Envio de pago");

        }
        // if else con varios else


        int hora = 1;

        if (hora >0 && hora <=8)
            System.out.println("durmiendo");
        else if (hora > 8 && hora <=15) {
            System.out.println("curso angular");
        }
        else if (hora > 15 && hora <21) {
            System.out.println("valor incorrecto");
        }


    }
}
