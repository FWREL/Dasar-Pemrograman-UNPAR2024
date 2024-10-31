public class Soal_E {
    public static void main(String[] args) {
        int jamTidur = 00;
        int menitTidur = 51;
        int jamBangun = 07;
        int menitBangun = 04;

        int lamaMenitTidur = (jamTidur * 60) + menitTidur;
        int lamaMenitBangun = (jamBangun * 60) + menitBangun;

        int hasil = lamaMenitBangun + lamaMenitTidur;
        System.out.println(hasil);
    }
}
