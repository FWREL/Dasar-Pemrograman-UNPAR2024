public class Soal_A {
    public static void main(String[] args) {
        int x1 = 0, y1 = 9;
        int x2 = 180, y2 = 314;
        int jarakLampu = 3; 

        double totalJarak = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        double totalLampu = (int) (totalJarak / jarakLampu) + 1;
        System.out.println(totalLampu);
    }
}
