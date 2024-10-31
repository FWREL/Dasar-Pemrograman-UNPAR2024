import java.util.Scanner;

public class Rook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        if ( x1 != x2 || y1 != y2 ) {
            if ((x1 == x2 && y1 != y2) || (x1 != x2 && y1 == y2)) {
                if (x1 == x2) {
                    if(y2 > y1) {
                        System.out.println("Maju");
                    } else {
                        System.out.println("Mundur");
                    }
                } else if (y1 == y2) {
                    if (x2 > x1) {
                        System.out.println("Kanan");
                    } else {
                        System.out.println("Kiri");
                    }
                }
            } else {
                System.out.println("Tidak sah");
            }
        } else {
            System.out.println("Tidak sah");
        }
    }    
}
