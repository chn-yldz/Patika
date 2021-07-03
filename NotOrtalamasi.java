import java.util.Scanner;
public class NotOrtalamasi{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int matematik,fizik,kimya,turkce,tarih,muzik;
        System.out.print("Matematik Notu :");
        matematik = scanner.nextInt();
        System.out.print("Fizik Notu :");
        fizik = scanner.nextInt();
        System.out.print("Kimya Notu :");
        kimya = scanner.nextInt();
        System.out.print("Türkçe Notu :");
        turkce = scanner.nextInt();
        System.out.print("Tarih Notu :");
        tarih = scanner.nextInt();
        System.out.print("Müzik Notu :");
        muzik = scanner.nextInt();
        double ortalama = (matematik+fizik+kimya+turkce+tarih+muzik) / 6;
        System.out.println("Ortalama :"+ortalama);
        boolean gecmeDurumu = ortalama >= 60;
        String info = gecmeDurumu ? "Geçtiniz.":"Kaldınız.";
        System.out.println(info);
        
    }
}