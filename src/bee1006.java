import java.util.Scanner;
import java.util.Locale;

public class bee1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, media;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        media = (A * 2 + B * 3 + C * 5) / 10;
        System.out.printf("MEDIA = %.1f\n", media);

        sc.close();

    }

}
