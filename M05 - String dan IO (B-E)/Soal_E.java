import java.util.Scanner;

public class Soal_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double P = sc.nextDouble(); // harga bensin per liter
        double X = sc.nextDouble(); // jumlah uang untuk beli bensin
        double A = sc.nextDouble(); // rata rata pemakaian bensin
        double D = sc.nextDouble(); // jarak satu kli perjalanan

        double bensinDibeli  = X / P;
        int totalJarak = (int) (bensinDibeli / A);
        int lamaBensin = (int) (totalJarak / (D * 2) + 1);
        int sisaBensin = (int) (totalJarak % (D * 2));

        System.out.printf("%.2f", bensinDibeli);
        System.out.print(" " + totalJarak);
        System.out.print(" " + lamaBensin);
        System.out.print(" " + sisaBensin);
    }
}