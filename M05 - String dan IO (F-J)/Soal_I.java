import java.util.Scanner;

public class Soal_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tanggal = sc.next();
        String x = sc.next();

        String day = tanggal.substring(0, 2);
        String month = tanggal.substring(2, 4);
        String year = tanggal.substring(4, 8);

        System.out.println(year + x + month + x + day);
    }
}