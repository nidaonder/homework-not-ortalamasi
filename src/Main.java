import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin
        sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana
        bastırılan programı yazın. Aynı program içerisinde koşullu ifadeler
        kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana
        "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın. */

        int mat, fizik, kimya, turkce, tarih, muzik ;

        Scanner giris = new Scanner(System.in) ;

        System.out.print("Matematik puanınızı giriniz : ");
        mat = giris.nextInt();

        System.out.print("Fizik puanınızı giriniz : ");
        fizik = giris.nextInt();

        System.out.print( "Kimya puanınızı giriniz : ") ;
        kimya = giris.nextInt() ;

        System.out.print("Türkçe puanınızı giriniz : ");
        turkce = giris.nextInt() ;

        System.out.print("Tarih puanınızı giriniz : ");
        tarih = giris.nextInt() ;

        System.out.print("Müzik puanınızı giriniz : ");
        muzik = giris.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik) ;
        double ortalama = toplam / 6.0 ;

        System.out.println(" Not ortalamanız = " + ortalama);
        System.out.println( ortalama > 60 ? " Geçtiniz" : " Kaldınız ");
    }
}
