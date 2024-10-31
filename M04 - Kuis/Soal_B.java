public class Soal_B {
    public static void main(String[] args) {
        int banyakSiswa = 100;
        int renang = 45;
        int menari = 53;
        int futsal = 40;
        int renangDanMenari = 25;
        int menariDanFutsal = 30;
        int renangDanFutsal = 17;

        int siswaTerdaftar = banyakSiswa - (renang + menari + futsal - renangDanMenari - menariDanFutsal - renangDanFutsal);
        System.out.println(siswaTerdaftar);
    }
}
