import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        int matematik, fizik, kimya,turkce, tarih, muzik;

        System.out.print("Matematik notunu giriniz: ");
        matematik = input.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunu giriniz: ");
        tarih= input.nextInt();

        System.out.print("Müzik notunu giriniz: ");
        muzik = input.nextInt();

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println(sonuc);
    }
}