import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        var entry = new Scanner (System.in);

        conversion(entry);

        entry.close();


    }

    private static void conversion(Scanner entry) {
        System.out.println("Ingrese los segundos: ");

        int segundos = entry.nextInt();

        long sec = segundos % 60;
        long minutos = segundos % 3600 / 60;
        long horas = segundos % 86400 / 3600;
        long dias = segundos / 86400;

        System.out.println(segundos+" segundos");

        System.out.println(dias + " días, " + horas + " horas, " + minutos + " minutos, " + sec + " segundos");
    }
}
