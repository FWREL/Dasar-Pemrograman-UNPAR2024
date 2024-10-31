import java.util.Scanner;
import java.util.Locale;

public class Soal_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.FRENCH);

        double uangIDR = sc.nextDouble();

        double idrToEuro = uangIDR / 17485.48;

        System.out.printf(Locale.FRENCH, "IDR %.2f%n" , uangIDR);
        System.out.printf(Locale.FRENCH, "EUR %.2f", idrToEuro);
    }    
}
