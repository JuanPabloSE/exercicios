import java.util.Locale;
import java.util.Scanner;

public class bee1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroFuncionario, horasTrabalhadas;
        double valorRecebido;

        numeroFuncionario = sc.nextInt();
        horasTrabalhadas = sc.nextInt();
        valorRecebido = sc.nextDouble();

        // CÁLCULO
        double salarioFuncionario = horasTrabalhadas * valorRecebido;

        // SAÍDA DE DADOS
        System.out.printf("NUMBER = %d\n", numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salarioFuncionario);

        sc.close();
    }

}

