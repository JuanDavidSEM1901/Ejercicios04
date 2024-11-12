import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        var entry = new Scanner (System.in);
        int base, exponente;
        
        System.out.println("Ingrese la base:");
        base = entry.nextInt();
        System.out.println("Ingrese el exponente: ");
        exponente = entry.nextInt();

        getResultado(base, exponente);

        entry.close();

        

    }

    private static void getResultado(int base, int exponente) {
        int resultado = (int) Math.pow(base, exponente);
        if (exponente == 0) {
            resultado = 1;
            System.out.println("Si el exponente es 0, la potencia es igual a 1.");
        }
        System.out.println("El resultado de la potencia es: " +resultado);
    }
}
