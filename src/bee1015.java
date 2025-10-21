import java.util.Locale;
import java.util.Scanner;

public class bee1015 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // VARIÁVEIS
        double x1, y1, x2, y2, distancia;

        // ENTRADA DE DADOS
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        // CÁLCULO DISTÂNCIA
        distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // SAÍDA DE DADOS
        System.out.printf("%.4f\n", distancia);

        sc.close();
    }

}
