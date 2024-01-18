package Herencia.Conherencia3;

public class MetodoPago {
    private String nombreEmisor;
    protected String nombreReceptor;
    private String numFactura;
    private  double cantidad;
    public MetodoPago() {
    }

    public MetodoPago(String nombreEmisor, String nombreReceptor, String numFactura, double cantidad) {
        this.nombreEmisor = nombreEmisor;
        this.nombreReceptor = nombreReceptor;
        this.numFactura = numFactura;
        this.cantidad = cantidad;
    }

    //metodos propios
    public boolean realizarPago(){
        System.out.println("Realizando pago por defecto (Contra reembolso");
        return true;
    }

    //getter y setter

    public String getNombreEmisor() {
        return nombreEmisor;
    }

    public void setNombreEmisor(String nombreEmisor) {
        this.nombreEmisor = nombreEmisor;
    }

    public String getNombreReceptor() {
        return nombreReceptor;
    }

    public void setNombreReceptor(String nombreReceptor) {
        this.nombreReceptor = nombreReceptor;
    }

    public String getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }
}
