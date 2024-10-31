public class Soal_B {
    public static void main(String[] args) {
        int uangDodo = 50000;
        int hargaSeblak = 25000;
        int kembalian = uangDodo - hargaSeblak;

        int kembalian20000 = kembalian / 20000;
        kembalian = kembalian % 20000;
        int kembalian10000 = kembalian / 10000;
        kembalian = kembalian % 10000;
        int kembalian5000 = kembalian / 5000;
        kembalian = kembalian % 5000;
        int kembalian1000 = kembalian / 1000;
        kembalian = kembalian % 1000;
        int kembalian500 = kembalian / 500;
        kembalian = kembalian % 500;
        int kembalian100 = kembalian / 100;
        kembalian = kembalian % 100;
        int kembalian50 = kembalian / 50;
        kembalian = kembalian % 50;

        int totalLembar = kembalian20000 + kembalian10000 + kembalian5000 + kembalian1000 + kembalian500 + kembalian100 + kembalian50;
        System.out.println(totalLembar);
    }    
}
