import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        var entry = new Scanner (System.in);
        int num1, num2, num3;

        System.out.println("Ingrese el primer numero");
        num1 = entry.nextInt();

        System.out.println("Ingrese el segundo numero");
        num2 = entry.nextInt();

        System.out.println("Ingrese el tercer numero");
        num3 = entry.nextInt();

        var promedio = getPromedio(num1, num2, num3);


        System.out.println("El promedio es: " +promedio);

        entry.close();

    }

    private static int getPromedio(int num1, int num2, int num3) {
        var sumaTotal = num1 + num2 + num3;
        var promedio = sumaTotal / 3;
        return promedio;
    }
}