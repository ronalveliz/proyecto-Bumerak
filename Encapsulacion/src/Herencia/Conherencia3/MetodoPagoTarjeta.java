package Herencia.Conherencia3;

public class MetodoPagoTarjeta extends MetodoPago {
    private String numTarjeta;
    private String codigoSeguridad;
    private String codigoSVL;
    public MetodoPagoTarjeta() {
    }

    public MetodoPagoTarjeta(String nombreEmisor, String nombreReceptor, String numFactura, double cantidad, String numTarjeta, String codigoSeguridad, String codigoSVL) {
        super(nombreEmisor, nombreReceptor, numFactura, cantidad);
        this.numTarjeta = numTarjeta;
        this.codigoSeguridad = codigoSeguridad;
        this.codigoSVL = codigoSVL;
    }
    // metodos Override

    @Override
    public boolean realizarPago() {
        // return super.realizarPago();
        System.out.println("pagando espere estamos trasladando susu bienes nos e nueva");
        return true;
    }

    // metodos getter y setter

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    public String getCodigoSVL() {
        return codigoSVL;
    }

    public void setCodigoSVL(String codigoSVL) {
        this.codigoSVL = codigoSVL;
    }
}
