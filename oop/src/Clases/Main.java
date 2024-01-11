package Clases;



public class Main {
    public static void main(String[] args) {

        Producto prod1 = new Producto();
        prod1.title ="IPhone";
        prod1.price = 220.99;
        prod1.quantity = 10;
        prod1.id = 1L;
        System.out.println(prod1);
        System.out.println(prod1.title);


        Producto prod2 = new Producto(2L,"tele", 500.00,3) ;
        Producto prod3 = new Producto(3L,"carro",20.36,5);
        Producto pord4 = new Producto("hola ronald");


    }
}
