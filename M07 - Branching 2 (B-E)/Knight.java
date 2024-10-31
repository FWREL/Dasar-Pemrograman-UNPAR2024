import java.util.Scanner;

public class Knight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int awal = sc.nextInt();
        int tujuan = sc.nextInt();
        
        int awalX = (awal - 1) / 8;
        int awalY = (awal - 1) % 8;
        int tujuanX = (tujuan - 1) / 8;
        int tujuanY = (tujuan - 1) % 8;

        int jarakX = tujuanY - awalY;
        int jarakY = awalX - tujuanX;

        if ( awal >= 1 && awal <= 64 && tujuan >= 1 && tujuan <= 64 ) {
            if (jarakX == -2 && jarakY == 1) {
                System.out.println("arah1");
            } else if (jarakX == -1 && jarakY == 2) {
                System.out.println("arah2");
            } else if (jarakX == 1 && jarakY == 2) {
                System.out.println("arah3");
            } else if (jarakX == 2 && jarakY == 1) {
                System.out.println("arah4");
            } else if (jarakX == 2 && jarakY == -1) {
                System.out.println("arah5");
            } else if (jarakX == 1 && jarakY == -2) {
                System.out.println("arah6");
            } else if (jarakX == -1 && jarakY == -2) {
                System.out.println("arah7");
            } else if (jarakX == -2 && jarakY == -1) {
                System.out.println("arah8");
            } else {
                System.out.println("invalid");
            }
        } else {
            System.out.println("invalid");
        }

        sc.close();
    }
}
