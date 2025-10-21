import java.util.Locale;
import java.util.Scanner;

public class bee1021 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // VARIÁVEL E ENTRADA DE DADOS
        double n;
        n = sc.nextDouble();

        // CONVERTENDO A VARIÁVEL *n* PARA CENTAVOS - INTEIRO.
        int centavos = (int) (n * 100 + 0.5);

        //SAÍDA (NOTAS:)
        System.out.println("NOTAS:");

        //CÁLCULO - NOTAS DE 100
        int cem =  centavos / 10000;
        int restoCem =  centavos % 10000;
        System.out.printf("%d nota(s) de R$ 100.00\n", cem);
        //CÁLCULO - NOTAS DE 50
        int cinquenta = restoCem / 5000;
        int restoCinquenta = restoCem % 5000;
        System.out.printf("%d nota(s) de R$ 50.00\n", cinquenta);
        //CÁLCULO - NOTAS DE 20
        int vinte = restoCinquenta / 2000;
        int restoVinte = restoCinquenta % 2000;
        System.out.printf("%d nota(s) de R$ 20.00\n", vinte);
        //CÁLCULO - NOTAS DE 10
        int dez = restoVinte / 1000;
        int restoDez = restoVinte % 1000;
        System.out.printf("%d nota(s) de R$ 10.00\n", dez);
        //CÁLCULO - NOTAS DE 5
        int cinco = restoDez / 500;
        int restoCinco = restoDez % 500;
        System.out.printf("%d nota(s) de R$ 5.00\n", cinco);
        int dois = restoCinco / 200;
        int restoDois = restoCinco % 200;
        System.out.printf("%d nota(s) de R$ 2.00\n", dois);

        //SAÍDA (MOEDAS:)
        System.out.println("MOEDAS:");

        // CÁLCULO - 1.00
        int umReal =  restoDois / 100;
        int restoUmReal = restoDois % 100;
        System.out.printf("%d moeda(s) de R$ 1.00\n", umReal);
        int cinquentaCentavos = restoUmReal / 50;
        int restoCinquentaCentavos = restoUmReal % 50;
        System.out.printf("%d moeda(s) de R$ 0.50\n", cinquentaCentavos);
        int vinteCincoCentavos =  restoCinquentaCentavos / 25;
        int restoVinteCentavos = restoCinquentaCentavos % 25;
        System.out.printf("%d moeda(s) de R$ 0.25\n", vinteCincoCentavos);
        int dezCentavos = restoVinteCentavos / 10;
        int restoDezCentavos = restoVinteCentavos % 10;
        System.out.printf("%d moeda(s) de R$ 0.10\n", dezCentavos);
        int cincoCentavos = restoDezCentavos / 5;
        int restoCincoCentavos = restoDezCentavos % 5;
        System.out.printf("%d moeda(s) de R$ 0.05\n", cincoCentavos);
        int umCentavos = restoCincoCentavos / 1;
        System.out.printf("%d moeda(s) de R$ 0.01\n", umCentavos);

        sc.close();
    }

}