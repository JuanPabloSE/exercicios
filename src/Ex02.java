import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // VARIÁVEIS
        double base, altura, area, perimetro, diagonal;

        // ENTRADA DE DADOS
        base = sc.nextDouble();
        altura = sc.nextDouble();

        // CÁLCULO
        area = base * altura;
        perimetro = base * 2.0 + altura * 2.0;
        diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));

        // SAÍDA DE DADOS

        System.out.printf("AREA = %.4f\n", area);
        System.out.printf("PERIMETRO = %.4f\n", perimetro);
        System.out.printf("DIAGONAL = %.4f\n", diagonal);

        sc.close();

    }
}
