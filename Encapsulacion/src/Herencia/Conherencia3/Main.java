package Herencia.Conherencia3;

public class Main {
    public static void main(String[] args) {
        MetodoPagoTarjeta tarjetaBlack = new MetodoPagoTarjeta("juanito",
                "CertiDEvs",
                "Factura-001",
                19.99,
                "1245678",
                "1235",
                "12"
        );
        System.out.println(tarjetaBlack.nombreReceptor);
        tarjetaBlack.realizarPago();




    }

}
