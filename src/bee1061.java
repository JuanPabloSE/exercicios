import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class bee1061 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // VARIÁVEIS
        String diaInicioTexto, diaFimTexto;
        int diaInicio, horaInicio, minutoInicio, segundoInicio, inicio;
        int diaFim, horaFim, minutoFim, segundoFim, fim, resto;
        int duracao, dia, hora, minuto, segundo;

        // ENTRADA DE DADOS - INÍCIO
        diaInicioTexto = sc.next(); // LER A PALAVRA (DIA)
        diaInicio = sc.nextInt(); // DIA (DATA/NÚMERO - EXEMPLO: 5)
        horaInicio = sc.nextInt();
        sc.next(); // IGNORA OS : DA ENTRADA HORA.
        minutoInicio = sc.nextInt();
        sc.next(); // IGNORA OS : DA ENTRADA MINUTO.
        segundoInicio = sc.nextInt();

        // ENTRADA DE DADOS - FIM
        diaFimTexto = sc.next();
        diaFim = sc.nextInt();
        horaFim = sc.nextInt();
        sc.next();
        minutoFim = sc.nextInt();
        sc.next();
        segundoFim = sc.nextInt();

        // CÁLCULO - DURACÃO
        inicio = (diaInicio * 24 * 60 * 60) + (horaInicio * 60 * 60) + (minutoInicio * 60) + segundoInicio;
        fim = (diaFim * 24 * 60 * 60) + (horaFim * 60  * 60) + (minutoFim * 60) + segundoFim;
        duracao = fim - inicio;

        // CÁLCULO DIAS, HORAS, MINUTOS, SEGUNDOS

        dia = duracao / (24 * 60 * 60);
        resto = duracao % (24 * 60 * 60);
        System.out.printf("%d dia(s)\n", dia);
        hora = resto / (60 * 60);
        resto = resto % (60 * 60);
        System.out.printf("%d hora(s)\n", hora);
        minuto = resto / 60;
        System.out.printf("%d minuto(s)\n", minuto);
        resto = resto % 60; // SEGUNDOS
        System.out.printf("%d segundo(s)\n", resto);


        sc.close();
    }
}