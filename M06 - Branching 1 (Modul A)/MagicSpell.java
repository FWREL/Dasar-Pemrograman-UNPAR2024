import java.util.Scanner;

public class MagicSpell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        char hurufPertama = text.charAt(0);
        char hurufTerakhir = text.charAt(text.length()-1);

        if (hurufPertama == hurufTerakhir) {
            System.out.println("magical");
        } else {
            System.out.println("tidak magical");
        }
    }
}
