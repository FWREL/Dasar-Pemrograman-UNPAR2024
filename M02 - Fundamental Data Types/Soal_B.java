public class Soal_B {
    public static void main(String[] args) {
        int D1 = 763154;

        int d1 = D1 / 100000;
        int d2 = (D1 / 10000) % 10;
        int d3 = (D1 / 1000) % 10;
        int d4 = (D1 / 100) % 10;
        int d5 = (D1 / 10) % 10;
        int d6 = D1 % 10;

        int D2 = d1*100000 + d4*10000 + d6*1000 + d5*100 + d3*10 + d2;

        int result = (D2 + 10) / 10 * 10;
        System.out.println(result);
    }
}

/*
 * a. Menghitung nilai keberuntungan sapi
 * b. Bilangan bulat D1 yang tersusun dari 6 digit
 * c. Nilai x yang merupakan nilai keberuntungan seekor sapi
 * d. Mengubah urutan digit kemudian dibulatkan ke kelipatan 10 terdekat
 * e. Menginput nilai D1 (d1,d2,d3,d4,d5,d6), kemudian urutan digit nya diubah menjadi d1,d4,d6,d5,d3,d2 dan dibulatkan ke kelipatan 10
 * f. CT Algoritma, CT Decomposition
 */