package Herencia.Conherencia3;


public class Main2 {

    public static void main(String[] args) {
        // array de MetodosPago [] con 3 métodos pago distintos: 2 paypal 3 tarjeta
        MetodoPagoPaypal paypalRonald = new MetodoPagoPaypal();
        MetodoPagoPaypal paypalJudit = new MetodoPagoPaypal();
        MetodoPagoTarjeta tarjetaAitor = new MetodoPagoTarjeta();
        MetodoPagoTarjeta tarjetaNoemi = new MetodoPagoTarjeta();
        MetodoPagoTarjeta tarjetaSilvia = new MetodoPagoTarjeta();

        // for para iterar y ejecutar realizarPago en todos ellos
        MetodoPago[] metodosPago = { paypalRonald, paypalJudit, tarjetaAitor, tarjetaNoemi, tarjetaSilvia };

        // simular que nos entran 5 compras de clientes y ejecutamos los pagos de todas con bucle
        for (MetodoPago metodo : metodosPago) {
            metodo.realizarPago();
        }

    }
}
