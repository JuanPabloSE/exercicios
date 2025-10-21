import java.util.Locale;
import java.util.Scanner;

public class bee1017 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // VARIÁVEIS
        int tempo, velocidadeMedia;
        double quantidadeLitrosNecessarios;

        // ENTRADA DE DADOS
        tempo = sc.nextInt();
        velocidadeMedia = sc.nextInt();

        // CÁLCULO
        quantidadeLitrosNecessarios = (double) tempo * velocidadeMedia / 12;

        // SAÍDA DE DADOS
        System.out.printf("%.3f\n", quantidadeLitrosNecessarios);

        sc.close();
    }

}
