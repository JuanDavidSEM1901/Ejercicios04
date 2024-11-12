import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        var entry = new Scanner(System.in);

        System.out.println("Ingrese un texto para identificar si es un Palindromo");
        var texto = entry.nextLine();

        getVerificacion(texto);

        entry.close();

    }

    private static void getVerificacion(String texto) {
        String textoLimpio = getTextolimpio(texto);

        StringBuilder invertido = new StringBuilder(textoLimpio);

        invertido.reverse();

        if (textoLimpio.equals(invertido.toString())) {
            System.out.println(texto + " ES UN PALINDROMO");
        } else {
            System.out.println(texto + " NO ES UN PALINDROMO");
        }
    }

    private static String getTextolimpio(String texto) {
        StringBuilder textolimpio = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            var c = texto.charAt(i);

            if (Character.isLetter(c)) {
                textolimpio.append(Character.toLowerCase(c));
            }
        }

        return textolimpio.toString();
    }
}
