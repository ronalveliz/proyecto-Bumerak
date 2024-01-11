package VargArgs;

public class FuncionesVarArgs {
    public static void main(String[] args) {
        System.out.println(sumatorio(10,20));
        System.out.println(sumatorio(10,20,10));
        System.out.println(sumatorio(10,20,20));
        System.out.println(sumatorio(10,20,30));
        System.out.println(sumatorio(10,20,40));

    }

    private static int sumatorio(int... numeros) {
        int suma =0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma ;
    }
}
