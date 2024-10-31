import java.util.Scanner;

public class DodoDanKotak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();

        double y = Math.round(Math.sqrt(v / (a + b)));
        double x = Math.round(y + b);

        System.out.printf("%.2f %.2f\n", x, y);
    }
}
