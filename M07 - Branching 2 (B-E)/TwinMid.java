import java.util.Scanner;

public class TwinMid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long y = sc.nextLong();

        x /= 2;
        long z = (long) Math.pow(10, x);

        long digTengah1 = (y / z) % 10;
        long digTengah2 = (y / (z/10)) % 10;

        if (digTengah1 == digTengah2) {
            System.out.println("Twin");
        } else {
            System.out.println("Not twin");
        }
    }
}