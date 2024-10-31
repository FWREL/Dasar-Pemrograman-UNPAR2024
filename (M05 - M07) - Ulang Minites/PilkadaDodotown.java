import java.util.Scanner;

public class PilkadaDodotown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long suaraDodo = sc.nextLong();
        long suaraWombat = sc.nextLong();

        long totalSuara = suaraDodo + suaraWombat;

        if (suaraDodo > totalSuara / 2) {
            System.out.println("Dodo menang");
        } else {
            System.out.println("Dodo belum menang");
        }

    }   
}
