import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        var entry = new Scanner (System.in);
        double peso, altura, imc;
        System.out.println("Ingrese su peso en Kilogramos.");
        peso = entry.nextDouble();
        System.out.println("Ingrese su altura en metros.");
        altura = entry.nextDouble();

        imc = getImc(peso, altura);

        categoriaImc(imc);

        entry.close();
        
    }

    private static void categoriaImc(double imc) {
        
        System.out.println("Categoría de peso según el IMC:");

        if (imc < 18.5) {
            System.out.println("BAJO PESO");
        } else if (imc > 18.5 && imc <= 24.9) {
            System.out.println("PESO NORMAL");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("SOBREPESO");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("OBESIDAD\nGrado I");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("OBESIDAD\nGrado II");
        } else if (imc >= 40) {
            System.out.println("OBESIDAD GRADO III");
        }
    }

    private static double getImc(double peso, double altura) {
        double imc;
        imc = peso / (altura * altura);
        System.out.printf("Su IMC es %.2f\n", imc);
        return imc;
        
    }
}
