package Telefono_movil;

public class Main {
    public static void main(String[] args) {
      TelefonoMovil telefono =new TelefonoMovil();
      telefono.encendido = false;
      telefono.fabricante ="Intel";
      telefono.modelo = "rob12.Premiun Bluis";
      telefono.ram = 80;
      telefono.numcore = 6;
      telefono.precio = 5236.59;
      TelefonoMovil motorola = new TelefonoMovil("Asus","520promaxxx",5,0,false,235698.99 );
      System.out.println(telefono);

      System.out.println(motorola);
      motorola.encender();


    }
}
