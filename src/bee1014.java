import java.util.Locale;
import java.util.Scanner;

public class bee1014 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // VARIÁVEIS
        int x;
        double y, consumoMedio;

        // ENTRADA DE DADOS
        x = sc.nextInt();
        y = sc.nextDouble();

        // CÁLCULO
        consumoMedio = x / y;

        // SAÍDA DE DADOS
        System.out.printf("%.3f km/l\n", consumoMedio);

        sc.close();

    }
}
