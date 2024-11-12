import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        var entry = new Scanner (System.in);

        getMultiplicacion(entry);

        entry.close();
    }

    private static void getMultiplicacion(Scanner entry) {
        System.out.println("Ingrese el numero al cual quiere saber su tabla de multiplicacion: ");
        int numero = entry.nextInt();

        for (int i = 1; i <= 10; i++) {
            var multiplicacion = numero * i;
            System.out.printf("%d x %d = %d\n", numero, i, numero * i);
        }
    }
}
