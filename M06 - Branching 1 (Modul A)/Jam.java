import java.util.Scanner;

public class Jam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jam = sc.nextInt();

        if (jam >= 12) {
            jam %= 12;
            System.out.println(jam + " p.m.");
        } else {
            System.out.println(jam + " a.m.");
        }
    }    
}
