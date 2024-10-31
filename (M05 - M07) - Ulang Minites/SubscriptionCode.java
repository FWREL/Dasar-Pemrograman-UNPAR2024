import java.util.Scanner;

public class SubscriptionCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        String S = sc.next();
        int kode = sc.nextInt();

        int hWarga = 1000;
        int hBos = 7000;
        int hJuragan = 10000;
        int hAnakSultan = 14000;
        int hSultan = 20000;

        if (kode == 1) {
            S += "Warg" + S.length();
            System.out.println(S + hWarga);
        } else if (kode == 2) {
            if (S.length() % 2 == 1) {
                S += "BossGanWarg" + S.length();
                System.out.println(S + (hWarga + hBos));
            } else {
                S += "BossGenWarg" + S.length();
                System.out.println(S + (hWarga + hBos));
            }
        } else if (kode == 3) {
            if (S.length() % 2 == 1) {
                S += "Jura" + S + "BossGanWarg" + S.length();
                System.out.println(S + (hWarga + hBos + hJuragan));
            } else {
                S += "Jura" + S + "BossGenWarg" + S.length();
                System.out.println(S + (hWarga + hBos + hJuragan));
            }
        } else if (kode == 4) {
            if (S.length() % 2 == 1) {
                S += "Asul" + S.substring(1, S.length()-1) + "Jura" + S + "BossGanWarg" + S.length();
                System.out.println(S + (hWarga + hBos + hJuragan + hAnakSultan));
            } else {
                S += "Asul" + S.substring(1, S.length()-1) + "Jura" + S + "BossGenWarg" + S.length();
                System.out.println(S + (hWarga + hBos + hJuragan + hAnakSultan));
            }
        } else if (kode == 5) {
            if (S.length() % 2 == 1) {
                S += "Sult" + "Asul" + S.substring(1, S.length()-1) + "Jura" + S + "BossGanWarg" + S.length();
                System.out.println(S + (hWarga + hBos + hJuragan + hAnakSultan + hSultan));
            } else {
                S += "Sult" + "Asul" + S.substring(1, S.length()-1) + "Jura" + S + "BossGenWarg" + S.length();
                System.out.println(S + (hWarga + hBos + hJuragan + hAnakSultan + hSultan));
            }
        } else {
            System.out.println(S + "0");
        }
    }

}
