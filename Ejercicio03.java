import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        var entry = new Scanner (System.in);

        
        
                System.out.println("INGRESE UN NUMERO ENTERO POSITIVO: ");
                var numero = entry.nextInt();
        
                if (numero > 0) {
                    long resultado = calculoFactorial(numero);

                    System.out.println("El factorial de "+numero+" es "+resultado);
                } else {
                    System.out.println("INGRESE UN NUMERO POSITIVO!");
                }

                entry.close();
            }
        
            private static long calculoFactorial(int n) {
                long factorial = 1;

                for (int i = 1; i <= n; i++) {
                    factorial *= i;
                }

                return factorial;

            }

    

}
