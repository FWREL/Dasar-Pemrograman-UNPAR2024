public class Soal_C {
    public static void main(String[] args) {
        int x1 = 90, y1 = 95;
        int x2 = 99, y2 = 98;
        int x3 = 95, y3 = 15;
        int maksChannel = 100;
    
        int pemencetanChannel1 = (y1 - x1 + maksChannel) % maksChannel;
        System.out.println(pemencetanChannel1);
        
        int pemencetanChannel2 = (y2 - x2 + maksChannel) % maksChannel;
        System.out.println(pemencetanChannel2);

        int pemencetanChannel3 = (y3 - x3 + maksChannel) % maksChannel;
        System.out.println(pemencetanChannel3);
    }    
}
