package Herencia.ConHerencia2;

public class Main {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("55204883L","ron.@ggkail.comin",653256985);
        Cliente cliente = new Cliente("55204883L","ron.@ggkail.comin",652365894,true,"5");
        Empleados emplieado1 = new Empleados("55204883L","ron.@ggkail.comin",652365894,01,10L,true,false);
        System.out.println(user1.toString());
        System.out.println(cliente.toString());
        System.out.println(emplieado1.toString());
    }
}
