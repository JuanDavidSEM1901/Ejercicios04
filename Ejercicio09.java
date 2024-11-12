import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        var entry = new Scanner(System.in);

        getInteresSimple(entry);

        getInteresCompuesto(entry);

        entry.close();


    }

    private static void getInteresCompuesto(Scanner entry) {
        double interesCompuesto, capitalInicial, tasaInteresAnual, numXaño, tiempoAños;
        System.out.println("INTERES COMPUESTO");
        
        System.out.println("Ingrese el capital inicial:");
        capitalInicial = entry.nextDouble();
        System.out.println("Ingrese la tasa de interés anual:");
        tasaInteresAnual = entry.nextDouble() / 100;
        System.out.println("Ingrese el número de veces que se aplica el interés compuesto por año: ");
        numXaño = entry.nextDouble();
        System.out.println("Ingrese el número de años:");   
        tiempoAños = entry.nextDouble();

        double montoTotal = capitalInicial * Math.pow((1 + tasaInteresAnual / numXaño), (numXaño * tiempoAños));
        double interesGenerado = montoTotal - capitalInicial;
        System.out.printf("El monto total acumulado es: %.2f\n", montoTotal);
        System.out.printf("El interes compuesto ganado es:  %.2f\n", interesGenerado);
        
    }

    private static void getInteresSimple(Scanner entry) {
        double interesSimple, capitalInicial, tasaInteresAnual, tiempoAños;

        System.out.println("INTERES SIMPLE");

        System.out.println("Ingrese el capital inicial:");
        capitalInicial = entry.nextDouble();
        System.out.println("Ingrese la tasa de interés anual:");
        tasaInteresAnual = entry.nextDouble() / 100;
        System.out.println("Ingrese el tiempo en años:");
        tiempoAños = entry.nextDouble();
        interesSimple = capitalInicial * tasaInteresAnual * tiempoAños;
        

        System.out.printf("El interés simple es: %.2f\n " , interesSimple);
    }
}
