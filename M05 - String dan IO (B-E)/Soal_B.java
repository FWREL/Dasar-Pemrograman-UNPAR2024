import java.util.Scanner;

public class Soal_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int g = sc.nextInt();
        int b = sc.nextInt();

        int minimalG = Math.min(g, b);
        int jamuCuko = minimalG * 2;

        System.out.println(jamuCuko);
    }
}
