import java.util.Scanner;

public class TopiDodo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaTopi = sc.next();
        int P = sc.nextInt(); // harga topi
        double A = sc.nextDouble(); // diskon 1
        double x = sc.nextDouble(); // angka acak
        double t = sc.nextDouble();// pajak

        double b = A * x / 100; // diskon 2
        int bInt = (int) (b + 0.5);

        double d1 = P * A / 100; // diskon pertama
        double d2 = d1 * bInt / 100; // diskon kedua
        double D = d1 + d2; // total disokon

        double S = P - D;
        double pajak = S * (t / 100);

        double harusDibayar = S + pajak;

        System.out.printf("%.0f %.0f%n", A, (double) bInt);
        System.out.printf("%.3f%n", S);
        System.out.printf("%.3f%n", pajak);
        System.out.printf("%.3f%n", harusDibayar);
        System.out.println(namaTopi);
    }    
}
