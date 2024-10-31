import java.util.Scanner;

public class Soal_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kecepatan = sc.nextInt();
        int waktu = sc.nextInt();
        waktu *= 60; // ubah ke detik
        double phi = 3.14;

        int jarak = kecepatan * waktu;
        double keliling = phi * 140;
        double putaran = jarak / keliling;

        System.out.printf("Banyaknya putaran lintasan: %.2f", putaran);
    }    
}
