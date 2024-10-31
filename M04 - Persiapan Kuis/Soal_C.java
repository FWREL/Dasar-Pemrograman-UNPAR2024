public class Soal_C {
    public static void main(String[] args) {
        int jamNyala = 8;
        int menitNyala = 37;
        int detikNyala = 29;
        int lamaNyala = 49135;

        int jamNyalaKeDetik = jamNyala * 3600;
        int menitNyalaKeDetik = menitNyala * 60;
        int totalDetikNyala = jamNyalaKeDetik + menitNyalaKeDetik + detikNyala;
        
        int lamaNyalaDetik = totalDetikNyala + lamaNyala;

        int jamMati = lamaNyalaDetik / 3600;
        int menitMati = (lamaNyalaDetik % 3600) / 60;
        int detikMati = lamaNyalaDetik % 60;

        System.out.println(jamMati + ":" + menitMati + ":" +detikMati);
    }
}
