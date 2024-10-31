/*
 * Mengetahui jarak balon yang terbang tersebut
 * Terdapat v (kecepatan), a (percepatan), t (waktu). Dan juga rumus yang diberikan yaitu d = vt + 1/2 at^2
 * Jarak balon yang terbang
 * Deklarasikan v, a, dan t. Kemudian hitung dengan rumus yang diberikan yaitu v * t + (0,5) * a * Math.pow(t, 2)
 * CT Algoritma
 */

public class Soal_A {
    public static void main(String[] args) {
        int v = 0;
        int a = 3;
        int t = 3;

        double d = v * t + (0.5) * a * Math.pow(t, 2);

        System.out.println(d);
    }
}