import java.util.Locale;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // VARIÁVEL
        String nome1, nome2;
        int idade1, idade2;

        // ENTRADA DE DADOS
        nome1 = sc.next();
        idade1 = sc.nextInt();
        nome2 = sc.next();
        idade2 = sc.nextInt();

        // CÁLCULO
        Double idadeMedia = (double) (idade1 + idade2) / 2;

        // SAÍDA DE DADOS
        System.out.printf("A idade média de %s e %s é de %.1f", nome1, nome2, idadeMedia);

        sc.close();
    }
}
