import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int diaInicio, horaInicio, minutoInicio, segundoInicio, inicio;
        int diaFim, horaFim, minutoFim, segundoFim, fim, duracao;
        int dia, hora, minuto, segundo, resto;

        // ENTRADA INICIO - PASSO 1
        System.out.print("Digite o dia de inicio: ");
        diaInicio = sc.nextInt();
        System.out.print("Digite a hora de inicio: ");
        horaInicio = sc.nextInt();
        System.out.print("Digite o minuto de inicio: ");
        minutoInicio = sc.nextInt();
        System.out.print("Digite o segundo de inicio: ");
        segundoInicio = sc.nextInt();

        System.out.println("");

        // ENTRADA FIM - PASSO 2
        System.out.print("Digite o dia de fim: ");
        diaFim = sc.nextInt();
        System.out.print("Digite a hora de fim: ");
        horaFim = sc.nextInt();
        System.out.print("Digite o minuto de fim: ");
        minutoFim = sc.nextInt();
        System.out.print("Digite o segundo de fim: ");
        segundoFim = sc.nextInt();

        System.out.println("");

        // CÁLCULO - DURAÇÃO - PASSO 3
        inicio = (diaInicio * 24 * 60 * 60) + (horaInicio * 60 * 60) + (minutoInicio * 60) +  segundoInicio;
        fim = (diaFim * 24 * 60 * 60) + (horaFim * 60 * 60) + (minutoFim * 60) + segundoFim;
        duracao = fim - inicio;

        // CÁLCULO DIA - PASSO 4
        dia = duracao / (24 * 60 * 60);
        resto = duracao % (24 * 60 * 60);

        // CÁLCULO HORA - PASSO 5
        hora = resto / (60 * 60);
        resto = resto % (60 * 60);

        // CÁLCULO MINUTO - PASSO 6
        minuto = resto / 60;

        // CÁLCULO SEGUNDO - PASSO 7
        resto = resto % 60; // SEGUNDO

        System.out.printf("Dia: %d dias, Hora: %d horas, Minuto: %d minutos, Segundo: %d segundos", dia, hora, minuto, resto);

        sc.close();
    }
}
