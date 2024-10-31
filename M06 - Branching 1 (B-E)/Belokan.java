import java.util.Scanner;

public class Belokan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        boolean p = (
            a.equals("Selatan") && b.equals("Utara") && c.equals("Timur")
        ) || (
            a.equals("Selatan") && (
                b.equals("Barat") && c.equals("Timur") ||
                b.equals("Barat") && c.equals("Utara")
            )
        );

        boolean q = (
            a.equals("Barat") && b.equals("Timur") && c.equals("Selatan")
        ) || (
            a.equals("Barat") && (
                b.equals("Utara") && c.equals("Selatan") ||
                b.equals("Utara") && c.equals("Timur")
            )
        );

        boolean r = (
            a.equals("Utara") && b.equals("Selatan") && c.equals("Barat")
        ) || (
            a.equals("Utara") && (
                b.equals("Timur") && c.equals("Barat") ||
                b.equals("Timur") && c.equals("Selatan")
            )
        );

        boolean s = (
            a.equals("Timur") && b.equals("Barat") && c.equals("Utara")
        ) || (
            a.equals("Timur") && (
                b.equals("Selatan") && c.equals("Utara") ||
                b.equals("Selatan") && c.equals("Barat")
            )
        );

        if (p || q || r || s) {
            System.out.println("Ya");
        } else {
            System.out.println("Tidak");
        }
    }    
}
