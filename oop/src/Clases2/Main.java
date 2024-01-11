package Clases2;

public class Main {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("deivi","veliz",29,"ve.deivi@hhuu.com");
        Usuario user2 = new Usuario("deivi","veliz",29,"ve.deivi@hhuu.com");
        Usuario user3 = new Usuario();
        user3.firstname = "rot";
        user3.lastname = "grerd";
        user3.edad = 25;
        user3.email = "sdfhs1254@golsmeil.com";
        user3.active = true;
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);



    }


}
