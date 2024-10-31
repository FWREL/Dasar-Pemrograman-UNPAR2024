/*
 * a. Menghitung total upah yang didapatkan tiap minggu
 * b. keliling taman petak 1 (persegi), petak 2 (segitiga sama sisi), petak 3 (lingkaran). Dan terdapat juga upah yang diberikan 15,234 per meter persegi
 * c. Total upah yang didapatkan dari hasil membersihkan tiap kebun
 * d. Menghitung luas taman per petaknya kemuudian kalikan dengan jumlah upah per meter nya
 * e. Hitung petak 1 dengan keliling petak / 4 untuk mendapatkan panajng tiap sisinya kemudian sisi petak 1 di kuadratkan karna berbentuk persegi. Kemudian pada petak 2 berbentuk segitiga sama sisi sehingga kelilingnya di bagi 3 dan mendapatkan hasil tiap sisinya, selanjutnya mencari tinggi dari segitiga yaitu dengan (sisi x akar 3) / 2 kemudian hitung luas segitiga dengan 1/2 * sisi * tinggi. Kemudian pada petak 3 berbentuk lingkaran, hitung jari jari lingkaran dengan keliling / 2 * phi, kemudian mendapat r nya dan hitung luasnya dengan phi * r * r. Kemudian jumlahkan keseluruhan luas petak dan kalikan dengan upah per meter persegi nya
 * f. CT Decomposition, CT Algoritma
 */


public class Minites {
    public static void main(String[] args) {
        int kelilingPetak1 = 1600;
        int kelilingPetak2 = 900;
        int kelilingPetak3 = 2200;
        double upahPerMeter = 15234.00;

        double sisiPetak1 = kelilingPetak1 / 4.0;
        double luasPetak1 = Math.pow(sisiPetak1, 2);

        double sisiPetak2 = kelilingPetak2 / 3.0;
        double tinggiPetak2 = (sisiPetak2 * Math.sqrt(3)) / 2;
        double luasPetak2 = (0.5) * sisiPetak2 * tinggiPetak2;

        double jariPetak3 = kelilingPetak3 / (2 * Math.PI);
        double luasPetak3 = Math.PI * Math.pow(jariPetak3, 2);

        double totalLuas = luasPetak1 + luasPetak2 + luasPetak3;
        double totalUpah = totalLuas * upahPerMeter;
        System.out.println(totalUpah);
    }
}