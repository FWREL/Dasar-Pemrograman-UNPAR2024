import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int depan = sc.nextInt();
        int atas = sc.nextInt();
        int kanan = sc.nextInt();
        String arah1 = sc.next();
        String arah2 = sc.next();;

        if (arah1.equals("depan")) {
            int temp = depan;
            depan = atas;
            atas = 7 - temp;
            kanan = kanan;
        } else if (arah1.equals("belakang")) {
            int temp = atas;
            atas = depan;
            depan = 7 - temp;
            kanan = kanan;
        } else if (arah1.equals("kanan")) {
            int temp = kanan;
            kanan = atas;
            atas = 7 - temp;
            depan = depan;
        } else if (arah1.equals("kiri")) {
            int temp = atas;
            atas = kanan;
            kanan = 7 - temp;
            depan = depan;
        }

        if (arah2.equals("depan")) {
            int temp = depan;
            depan = atas;
            atas = 7 - temp;
            kanan = kanan;
        } else if (arah2.equals("belakang")) {
            int temp = atas;
            atas = depan;
            depan = 7 - temp;
            kanan = kanan;
        } else if (arah2.equals("kanan")) {
            int temp = kanan;
            kanan = atas;
            atas = 7 - temp;
            depan = depan;
        } else if (arah2.equals("kiri")) {
            int temp = atas;
            atas = kanan;
            kanan = 7 - temp;
            depan = depan;
        }

        System.out.println(atas);
    }    
}
