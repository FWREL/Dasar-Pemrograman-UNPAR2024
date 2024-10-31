import java.util.Scanner;

public class WombatTV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int pencet = ((b-a) + 100) % 100;
        if (b > a) {
            System.out.println(pencet + " Naik");
        } else {
            System.out.println(pencet + " Turun");
        }
    }
}