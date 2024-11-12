import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        var entry = new Scanner(System.in);

        
        
        getMenu(entry);

        entry.close();
    }

    private static void getMetrosKm(Scanner entry) {
        double kilometros;
        double metros;
        System.out.println("Ingrese los metros que desea convertir a Kilometros");
        metros = entry.nextDouble();
        kilometros = metros / 1000;
        System.out.println(metros + " mts son " + kilometros + " KM");
    }

    private static void getMenu(Scanner entry) {
        int opcion;
        do {
        System.out.println(
                "CONVERSION DE UNIDADES\n1.Metros a kilometros\n2.Kilometros a Metros\n3.Gramos a Kilogramos\n4.Kilogramos a Gramos\n5.Salir\nSeleccione una opcion: ");
        opcion = entry.nextInt();

        
            switch (opcion) {
                case 1:

                    getMetrosKm(entry);

                    break;
                case 2:

                    getkmToMeters(entry);
                    break;
                case 3:
                    getgramosAKg(entry);
                    break;
                case 4:
                    getkgAGramos(entry);
                    break;
                case 5:

                    System.out.println("Saliendo del programa....");
                    break;

                default:
                    System.out.println("OPCION INVALIDA! INGRESE OTRA OPCION...");
                    break;
            }

        } while (opcion != 5);
    }

    private static void getkgAGramos(Scanner entry) {
        double gramos;
        double kg;
        System.out.println("Ingrese los Kilogramos que desea convertir a Gramos");
        kg = entry.nextDouble();
        gramos = kg * 1000;
        System.out.println(kg + " Kilogramos son " + gramos + " Gramos");
    }

    private static void getgramosAKg(Scanner entry) {
        double gramos;
        double kg;
        System.out.println("Ingrese los Gramos que desea convertir a Kilogramos");
        gramos = entry.nextDouble();
        kg = gramos * 0.001;
        System.out.println(gramos + " Gramos son " + kg + " Kg");
    }

    private static void getkmToMeters(Scanner entry) {
        double kilometros;
        double metros;
        System.out.println("Ingrese los kilometros que desea convertir a Metros");
        kilometros = entry.nextDouble();
        metros = kilometros * 1000;
        System.out.println(kilometros + " Km son " + metros + " Mts");
    }
}
