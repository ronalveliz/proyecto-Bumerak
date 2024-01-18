package Herencia.SinHerencia;

public class Bicicleta {
    private String fabricante;
    private String modelo;
    private int numRuedas;

    private String materiales;
    private boolean suspenciondelantera;
    private boolean suspenciontracera;

    public Bicicleta() {
    }

    public Bicicleta(String fabricante, String modelo, int numRuedas, String materiales, boolean suspenciondelantera, boolean suspenciontracera) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.numRuedas = numRuedas;
        this.materiales = materiales;
        this.suspenciondelantera = suspenciondelantera;
        this.suspenciontracera = suspenciontracera;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    public boolean isSuspenciondelantera() {
        return suspenciondelantera;
    }

    public void setSuspenciondelantera(boolean suspenciondelantera) {
        this.suspenciondelantera = suspenciondelantera;
    }

    public boolean isSuspenciontracera() {
        return suspenciontracera;
    }

    public void setSuspenciontracera(boolean suspenciontracera) {
        this.suspenciontracera = suspenciontracera;
    }
}
