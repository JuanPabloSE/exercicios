import java.util.Locale;
import java.util.Scanner;

public class bee1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // VARIÁVEIS
        String nome;
        double salario, vendasMes;
        int comissao = 15;

        // ENTRADAS
        nome = sc.next();
        salario = sc.nextDouble();
        vendasMes = sc.nextDouble();

        //CÁLCULO TOTAL
        double total = vendasMes * comissao / 100;
        double totalFinal = salario + total;

        System.out.printf("TOTAL = R$ %.2f\n", totalFinal);

        sc.close();
    }

}
