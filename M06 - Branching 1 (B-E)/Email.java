import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String email = sc.next();

        if (email.indexOf("@") == email.lastIndexOf("@") &&
            email.indexOf(".") == email.lastIndexOf(".") &&
            email.indexOf("@") < email.lastIndexOf(".") && 
            email.indexOf("@") > 0 &&
            email.indexOf(".") != email.length() - 1 &&
            email.indexOf("@") + 1 != email.indexOf(".")) {
            System.out.println("Memenuhi syarat");
        } else {
            System.out.println("Tidak memenuhi syarat");
        }
    }    
}
