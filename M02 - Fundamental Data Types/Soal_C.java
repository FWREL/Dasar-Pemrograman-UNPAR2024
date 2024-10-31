public class Soal_C {
    public static void main(String[] args) {
        int x1 = 0, y1 = 0;
        int x2 = 1, y2 = 2;
        int x3 = 3, y3 = 4;
        int x4 = 5, y4 = 6;

        double jarak1 = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)) * 2;
        double jarak2 = Math.sqrt(Math.pow(x3-x1, 2) + Math.pow(y3-y1, 2)) * 2;
        double jarak3 = Math.sqrt(Math.pow(x4-x1, 2) + Math.pow(y4-y1, 2)) * 2;

        double totalJarak = jarak1 + jarak2 + jarak3;
        System.out.println(totalJarak);
    }
}

/*
 * a. Menghitung total jarak saat berpergian mengantar oleh oleh sampai kembali lagi ke rumah
 * b. Koordinat rumah Dodo dan ketiga sahabatnya, kemudian informasi rute bepergian rumah ke tujuan, tujuan ke rumah, dan seterusnya
 * c. Total jarak yang ditempuk dodo ke rumah sahabat 1, sahabat 2, dan sahabat 3
 * d. Menghitung jarak rumah ke tujuan menggunakan koordinat kartesius
 * e. Hitung dengan rumus (TujuanX - RumahX) dikuadratkan + (TujuanY - RumahX) dikuadratkan hasil penjumlahan tersebut di akarkan
 * f. CT Decomposition, CT Algoritma
 */