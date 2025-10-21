import java.util.Locale;
import java.util.Scanner;

public class bee1011 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // VARIÁVEL RAIO E ENTRADA
        double raio;
        double pi = 3.14159;
        raio = sc.nextDouble();

        // CÁLCULO
        double calculoRaio = (4/3.0) * pi * Math.pow(raio,3);

        // SAÍDA
        System.out.printf("VOLUME = %.3f\n", calculoRaio);

        sc.close();
    }

}
