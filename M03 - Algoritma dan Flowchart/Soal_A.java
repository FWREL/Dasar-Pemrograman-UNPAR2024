
public class Soal_A {
    public static void main(String[] args) {
        int bilanganBulat = 56789;

        int d1 = bilanganBulat / 10000;
        int d2 = (bilanganBulat % 10000) / 1000;
        int d3 = (bilanganBulat % 1000) / 100;
        int d4 = (bilanganBulat % 100) / 10;
        int d5 = bilanganBulat % 10;

        int bilanganGanjil = d1 + d3 + d5;
        int bilanganGenap = d2 + d4;

        double hasil = (double) bilanganGanjil / bilanganGenap;
        System.out.println(hasil);
    }
}
