import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matematik,fizik,kimya,turkce,tarih,muzik;
        System.out.println("Matematik notunu giriniz ?");
        matematik = input.nextInt();
        System.out.println("Fizik notunu giriniz ?");
        fizik = input.nextInt();
        System.out.println("Kimya notunu giriniz ?");
        kimya = input.nextInt();
        System.out.println("Türkçe notunu giriniz ?");
        turkce = input.nextInt();
        System.out.println("Tarih notunu giriniz ?");
        tarih = input.nextInt();
        System.out.println("Müzik notunu giriniz ?");
        muzik = input.nextInt();
        int toplam = (matematik+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam / 6;
        System.out.println(sonuc >= 60 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız");
        }
    }
