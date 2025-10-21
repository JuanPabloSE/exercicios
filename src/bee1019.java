import java.util.Locale;
import java.util.Scanner;

public class bee1019 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // VARIÁVEL E ENTRADA DE DADOS
        int n = sc.nextInt();

        // CÁLCULO
        int segundos = n / 3600; // SEGUNDOS DA ENTRADA DIVIDIDO POR (3600 Segundos = 1 HORA)
        int resto = n % 3600; // RESTO DA DIVISÃO

        int minutos = resto / 60; // RESTO DA DIVISÃO DE SEGUNDOS E HORAS DIVIDIDO POR (60 Segundos = 1 Minuto)
        int restoSegundos = resto % 60; // RESTO DA DIVISÃO = SEGUNDO (O QUE SOBRAR É SEGUNDOS)

        System.out.printf("%d:%d:%d", segundos, minutos, restoSegundos);


        sc.close();
    }
}
