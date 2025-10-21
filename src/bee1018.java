import java.util.Locale;
import java.util.Scanner;

public class bee1018 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // ENTRADA DE DADOS
        int n = sc.nextInt();
        int valor = n;
        int cem, restoCem, cinquenta, restoCinquenta, vinte, restoVinte, dez, restoDez, cinco, restoCinco, dois, restoDois, um, restoUm;

        // CÁLCULO
        cem = n / 100;
        restoCem = n % 100;

        cinquenta = restoCem / 50;
        restoCinquenta = restoCem % 50;

        vinte = restoCinquenta / 20;
        restoVinte = restoCinquenta % 20;

        dez = restoVinte / 10;
        restoDez = restoVinte % 10;

        cinco = restoDez / 5;
        restoCinco = restoDez % 5;

        dois = restoCinco / 2;
        restoDois = restoCinco % 2;

        um = restoDois / 1;
        restoUm = restoDois % 1;

        // SAÍDA DE DADOS
        System.out.println(valor);
        System.out.printf("%d nota(s) de R$ 100,00\n", cem);
        System.out.printf("%d nota(s) de R$ 50,00\n", cinquenta);
        System.out.printf("%d nota(s) de R$ 20,00\n", vinte);
        System.out.printf("%d nota(s) de R$ 10,00\n", dez);
        System.out.printf("%d nota(s) de R$ 5,00\n", cinco);
        System.out.printf("%d nota(s) de R$ 2,00\n", dois);
        System.out.printf("%d nota(s) de R$ 1,00\n", um);

        sc.close();
    }

}
