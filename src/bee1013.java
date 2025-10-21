import java.util.Locale;
import java.util.Scanner;

public class bee1013 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // VARIÁVEIS
        int A, B, C, maiorAb, maior;

        // ENTRADA DE DADOS
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        // CÁLCULO
        maiorAb = (A + B + Math.abs(A - B)) / 2;
        maior = (maiorAb + C + Math.abs(maiorAb - C)) / 2;

        // SAÍDA DE DADOS
        System.out.println(maior + " eh o maior");


        sc.close();

    }

}
