package Herencia.ConHerencia;

public class Bicicleta  extends Vehiculo{
    private String materiales;
    private boolean suspenciondelantera;
    private boolean suspenciontracera;

    public Bicicleta() {
    }

    public Bicicleta(String fabricante, String modelo, int numRuedas, String materiales, boolean suspenciondelantera, boolean suspenciontracera) {
        super(fabricante, modelo, numRuedas);
        System.out.println("hola a todos");
        this.materiales = materiales;
        this.suspenciondelantera = suspenciondelantera;
        this.suspenciontracera = suspenciontracera;
    }
    //set y get

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

    @Override
    public String toString() {
        return "Bicicleta{" +
                "materiales='" + materiales + '\'' +
                ", suspenciondelantera=" + suspenciondelantera +
                ", suspenciontracera=" + suspenciontracera +
                '}';
    }
}
