import java.util.Scanner;

public class Soal_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaDepan = sc.next();
        String namaBelakang = sc.next();
        double tinggi = sc.nextDouble();
        double berat = sc.nextDouble();

        tinggi /= 100;
        double IMT =  berat / Math.pow(tinggi, 2);

        System.out.print(namaBelakang + ", " + namaDepan + " ");
        System.out.printf("%.4f", IMT);
    }    
}
