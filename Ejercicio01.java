import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        var entry = new Scanner(System.in);

        // MENU

        MenuOptions(entry);

        entry.close();

    }

    private static void MenuOptions(Scanner entry) {

        int option;

        do {
        System.out.println("CONVERSION DE TEMPERATURAS\n1.Celsius a Fahrenheit\n2.Fahrenheit a Celsius\n0.Salir\nSeleccione una opcion:");
        option = entry.nextInt();
        entry.nextLine();

        switch (option) {
            case 1:
                celsiusToFarenheit(entry);
                break;
            case 2:
                fahrenheitToCelsius(entry);
            case 0: System.out.println("SALIENDO DEL PROGRAMA");
            break;    
        
            default:
                System.err.println("VALOR INVALIDO!");
                break;
        }

    } while (option != 0);
    }

    private static void fahrenheitToCelsius(Scanner entry) {
        System.out.println("Ingrese los Fahrenheit que quiere convertir a Celsius");
        var fahrenheit = entry.nextInt();
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.println(fahrenheit + " Fahrenheit son " + celsius + " Celsius");
    }

    private static void celsiusToFarenheit(Scanner entry) {
        System.out.println("Ingrese los Celsius que quiere convertir a Fahrenheit");
        var celsius = entry.nextInt();
        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.println(celsius + " celsius son " + fahrenheit + " Fahrenheit");
    }
}
