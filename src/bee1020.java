import java.util.Locale;
import java.util.Scanner;

public class bee1020 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // VARIÁVEL + ENTRADA DE DADOS
        int idade = sc.nextInt();

        // CÁLCULO
        int ano = idade / 365; // IDADE EM ANOS
        int resto = idade % 365; // RESTO PARA DESCOBRIR (MÊS)

        int mes = resto / 30; // IDADE EM MESES
        int restoDias = resto % 30; // RESTO PARA DIAS

        // SAÍDA DE DADOS
        System.out.printf("%s ano(s)\n", ano);
        System.out.printf("%s mes(es)\n", mes);
        System.out.printf("%s dia(s)\n", restoDias);

        sc.close();
    }
}
