import java.util.Scanner;

public class Soal_J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama = sc.nextLine();
        int n = sc.nextInt();
        long waktu = sc.nextLong();

        nama = nama.substring(0, n);

        long jam = waktu / 3600;
        long menit = (waktu % 3600) / 60;
        long detik = waktu % 60;

        System.out.println(nama);
        System.out.println(jam + " jam " + menit + " menit " + detik + " detik")    ;
    }
}