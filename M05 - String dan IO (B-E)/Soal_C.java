import java.util.Scanner;
 
public class Soal_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaTengah = sc.next();
        double D1 = sc.nextDouble();
        double D2 = sc.nextDouble();
 
        int n = (int) ((D1/D2) + 0.5);
 
        char n0 = namaTengah.charAt(0);
        char n1 = namaTengah.charAt(1 * n);
        char n2 = namaTengah.charAt(2 * n);
        char n3 = namaTengah.charAt(3 * n);
 
        System.out.print(n0);
        System.out.print(n1);
        System.out.print(n2);
        System.out.print(n3);
    }
}