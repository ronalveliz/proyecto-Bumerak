package Bumerak.Estruc_Control;

import java.util.UUID;

public class Funciones {

    public static final double IVA_ESTANDAR = 0.21;

    public static void main(String[] args) {
        double precioSinIva = 100;
        double precioConIva = calcularIva(precioSinIva);
        System.out.println(precioConIva);
        double [ ] notas ={1.5, 5.5, 6, 3, 5};
        double promedioNotas = promedio(notas);
        System.out.println(promedioNotas);
        double promedioNotas2 = promedio(new double[]{5.5,5,6,8,9});
        System.out.println(promedioNotas2);
        long notaFinal = Math.round(promedioNotas2);
        System.out.println("tu nota es: "+ notaFinal);

        }

    private static double calcularIva(double precioSinIva) {
        return precioSinIva * IVA_ESTANDAR + precioSinIva;

    }



    private static double promedio(double[] notas) {
        double sumatoria = 0;

        for (double nota : notas) {
            sumatoria += nota;
        }

        return sumatoria / notas.length;

    }
}







