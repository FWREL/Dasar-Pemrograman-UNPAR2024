import java.util.Scanner;

public class WaktuPerjalanan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int jarakX = x2-x1;
        int jarakY = Math.abs(y2-y1);
        int waktu = Math.max(jarakX, jarakY);

        System.out.println(waktu);
    }    
}
