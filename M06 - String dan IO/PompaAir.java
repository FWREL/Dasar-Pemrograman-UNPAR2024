import java.util.Scanner;

public class PompaAir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int panjang = sc.nextInt();
        int lebar = sc.nextInt();
        int tinggi = sc.nextInt();
        int debitAir = sc.nextInt();

        int volumeBakMandi = panjang * lebar * tinggi;
        int waktuPompa = volumeBakMandi / debitAir;

        System.out.println(waktuPompa);

        sc.close();
    }    
}
