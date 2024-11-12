import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        var entry = new Scanner (System.in);

        System.out.println("|CALCULO DE AREAS|");

        getAreaCirculo(entry);

        getAreaCuadrado(entry);

        getAreaTriangulo(entry);

        entry.close();

    }

    private static void getAreaTriangulo(Scanner entry) {
        double base, altura;

        System.out.println("AREA DE UN TRIANGULO\nIngrese la base y la altura del triangulo");
        System.out.println("Base:");
        base = entry.nextDouble();
        System.out.println("Altura:");
        altura = entry.nextDouble();

        double areaTriangulo = (base * altura) / 2;

        System.out.println("El area del triangulo es: "+areaTriangulo);
    }

    private static void getAreaCuadrado(Scanner entry) {
        double lado;
        System.out.println("AREA DE UN CUADRADO\nIngrese la longitud del lado del Cuadrado");
        lado = entry.nextDouble();
        double areaCuadrado = Math.pow(lado, 2);
        System.out.println("El area del cuadrado es: "+areaCuadrado);
    }

    private static void getAreaCirculo(Scanner entry) {
        double Pi = Math.PI;
        double radio;
        System.out.println("AREA DE UN CIRCULO\nIngrese el valor del radio del circulo");
        radio = entry.nextDouble();
        double areaCirculo = Pi * Math.pow(radio, 2);
        System.out.println("El area del circulo es: "+areaCirculo);
    }
}
