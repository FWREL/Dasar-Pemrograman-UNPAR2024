public class Soal_D {
    public static void main(String[] args)  {
        int Dono1 = 20;
        int Dono2 = 15;
        int lintasan = 100;

        double kecepatanTotal = Dono1 + Dono2;
        double waktuBertemu = lintasan / kecepatanTotal;
        double jarakTemu = waktuBertemu * Dono1;

        System.out.println(jarakTemu);

    }   
}
