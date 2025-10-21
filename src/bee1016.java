import java.util.Locale;
import java.util.Scanner;

public class bee1016 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // VARIÁVEIS
        int quilomentros, tempoMinutos;

        // ENTRADA DE DADOS
        quilomentros = sc.nextInt();

        // CÁLCULO
        tempoMinutos = quilomentros * 2;

        // SAÍDA DE DADOS
        System.out.printf("%d minutos\n", tempoMinutos);


        sc.close();
    }
}
