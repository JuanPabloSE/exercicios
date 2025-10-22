import java.util.Locale;
import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // VARIÁVEIS
        double valor;
        int quantidadeNotas, quantidadeMoedas, nota, moeda, resto;

        // ENTRADA DE DADOS
        valor = sc.nextDouble();

        // CÁLCULO
        int valorConvertido = (int) Math.round(valor * 100); // MULTIPLICAÇÃO - VALOR CONVERTIDO PARA CENTAVOS (INTEIRO).

        System.out.println("NOTAS:");

        // CÁLCULO DE NOTAS (1 POR UMA)
        nota = 100;
        quantidadeNotas = valorConvertido / (nota * 100); // MULTIPLICAÇÃO - TRANSFORMA A NOTA EM CENTAVOS INTEIRO E DIVIDE PELA CONVERSÃO DO VALOR DE ENTRADA
        System.out.printf("%d nota(s) de R$ 100.00\n", quantidadeNotas);
        resto = valorConvertido % (nota * 100);

        nota = 50;
        quantidadeNotas = resto / (nota * 100);
        System.out.printf("%d nota(s) de R$ 50.00\n", quantidadeNotas);
        resto = resto % (nota * 100);

        nota = 20;
        quantidadeNotas = resto / (nota * 100);
        System.out.printf("%d nota(s) de R$ 20.00\n", quantidadeNotas);
        resto = resto % (nota * 100);

        nota = 10;
        quantidadeNotas = resto / (nota * 100);
        System.out.printf("%d nota(s) de R$ 10.00\n", quantidadeNotas);
        resto = resto % (nota * 100);

        // CÁLCULO DE MOEDAS
        System.out.println("MOEDAS:");

        moeda = 5;
        quantidadeMoedas = resto / (moeda * 100);
        System.out.printf("%d moeda(s) de 5.00\n", quantidadeMoedas);
        resto = resto % (moeda * 100) ;

        moeda = 1;
        quantidadeMoedas = resto / (moeda * 100) ;
        System.out.printf("%d moeda(s) de R$ 1.00\n", quantidadeMoedas);
        resto = resto % (moeda * 100);

        moeda = 50; // 50 CENTAVOS
        quantidadeMoedas = resto / moeda;
        System.out.printf("%d moeda(s) de R$ 0.50\n", quantidadeMoedas);
        resto = resto % moeda;

        moeda = 25; // CENTAVOS
        quantidadeMoedas = resto / moeda;
        System.out.printf("%d moeda(s) de R$ 0.25\n", quantidadeMoedas);
        resto = resto % moeda;

        moeda = 10; // CENTAVOS
        quantidadeMoedas = resto / moeda;
        System.out.printf("%d moeda(s) de R$ 0.10\n", quantidadeMoedas);
        resto = resto % moeda;

        moeda = 5; // CENTAVOS
        quantidadeMoedas = resto / moeda;
        System.out.printf("%d moeda(s) de R$ 0.05\n", quantidadeMoedas);
        resto  = resto % moeda;

        moeda = 1; // CENTAVOS
        quantidadeMoedas = resto / moeda;
        System.out.printf("%d moeda(s) de R$ 0.01\n", quantidadeMoedas);

        sc.close();
    }

}
