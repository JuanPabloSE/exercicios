import java.util.Scanner;
import java.util.Locale;

public class bee1012 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // VARIÁVEIS
        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
        double pi = 3.14159;

        // ENTRADA DE DADOS

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        // CÁLCULO
        triangulo = A * C / 2;
        circulo = pi * Math.pow(C, 2);
        trapezio = (A + B) / 2 * C;
        quadrado = Math.pow(B, 2);
        retangulo = A * B;

        // SAÍDA DE DADOS
        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);

        sc.close();
    }

}
