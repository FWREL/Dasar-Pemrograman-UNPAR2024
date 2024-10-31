public class Soal_E {
    public static void main(String[] args) {
        int tube1 = 180;
        int tube2 = 225;
        int tube3 = 193;
        int tube4 = 201;
        int tubeDipakai = 11;

        int gosok1 = tube1 / tubeDipakai;
        int gosok2 = tube2 / tubeDipakai;
        int gosok3 = tube3 / tubeDipakai;
        int gosok4 = tube4 / tubeDipakai;
        System.out.println((gosok1 + 1) + ", " + (gosok1 + gosok2 + 2) + ", " + (gosok1 + gosok2 + gosok3 + 3) + ", ");

        int sisaTube1 = tube1 % tubeDipakai;
        int sisaTube2 = (sisaTube1 + tube2) % tubeDipakai;
        int sisaTube3 = (sisaTube2 + tube3) % tubeDipakai;
        int sisaTube4 = (sisaTube3 + tube4) % tubeDipakai;
        System.out.println(sisaTube4);
    }    
}

/*
 *  1. Menentukan penggosokkan gigi ke berapa Dodo harus membuka tube baru dan mengetahui berapa isi pasta di tube terakhir yang tidak digunakan Dodo.
    2. Terdapat 4 tube pasta gigi dengan isi : 180gr, 225gr, 193gr, dan 201gr, kemudian Dodo membutuhkan 11gr pasta gigi.
    3. Jumlah penggosokan gigi ke berapa untuk membuka tube baru dan sisa pasta gigi.
    4. Menghitung berapa kali menggosok gigi dengan satu tube sebelum membuka yang baru dan menghitung berapa gram yang akan tersisa.
    5. Untuk menghitung jumlah berapa kali gosokan untuk mengganti pasta gigi itu dengan membagi tube dengan jumlah pemakaian, kemeudian untu kmenghitung sisa Tube itu dengan tube % pemakaian, untuk tube selanjutnya itu (tube Sebelum + tube Sekarang) % pemakaian
    6. CT Algoritma
 */