import java.util.Scanner;

public class Soal_G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String kata = sc.next();
        int n = sc.nextInt();

        String hurufAwal = kata.substring(0, n);

        System.out.println(hurufAwal.toUpperCase());
    }    
}
