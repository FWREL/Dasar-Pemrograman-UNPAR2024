import java.util.Scanner;

public class WaktuPerjalananII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int waktuLurus = sc.nextInt();
        int waktuDiagonal = sc.nextInt();

        int deltaX = Math.abs(x2-x1);
        int deltaY = Math.abs(y2-y1);

        int totalWaktu1 = (deltaY + deltaX) * waktuLurus;
        int totalWaktu2 = (Math.min(deltaY, deltaX) * waktuDiagonal);
        int totalWaktu3 = Math.abs(deltaY-deltaX) * waktuLurus;

        int totalWaktu = Math.min(totalWaktu1, totalWaktu2 + totalWaktu3);

        System.out.println(totalWaktu);
        
    }    
}
