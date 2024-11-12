import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {

        /*
         * NUMEROS PRIMOS
         * NUMEROS ENTEROS
         * SOLO TIENEN DOS DIVISORES EL NUMERO 1 Y ELLOS MISMOS
         * EL RESULTADO AL DIVIDIR ES NUMERO ENTERO
         */

        var entry = new Scanner(System.in);

        System.out.println("Ingrese un numero:");

        var numero = entry.nextInt();

        getVerification(numero);

        entry.close();

    }

    private static void getVerification(int numero) {
        if (numero < 2) {
            System.out.println(numero + " NO ES PRIMO");

        } else if (numero == 2 || numero == 3) {
            System.out.println(numero + " ES PRIMO");
        }

        var raizCuadrada = Math.sqrt(numero);

        for (int i = 2; i <= raizCuadrada; i++) {
            if (numero % i == 0) {
                System.out.println(numero + " NO ES PRIMO");
                break;
            }
            if (numero % i != 0) {
                System.out.println(numero + " ES PRIMO");
                break;
            }
        }
    }

}
