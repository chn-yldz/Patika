import java.util.Scanner;
public class GelismisHesapMakinesi{
    static void toplama(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Toplanacak Sayı Adedi :");
        int adet = scanner.nextInt();
        int total = 0;
        for (int i=1;i<=adet;i++){
            System.out.print(i+". Sayı :");
            int sayi = scanner.nextInt();
            total += sayi;
        }
        System.out.println("Sonuç :"+total);

    }
    static void cikarma(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Adedi :");
        int adet = scanner.nextInt();
        int result = 0;
        int sayi;
        if (adet == 1){
            System.out.print("Sayı :");
            sayi = scanner.nextInt();
            result+=sayi;
            System.out.println("Sonuç :"+sayi);
        }else{
            for (int i=1;i<=adet;i++){
                System.out.print(i+". Sayı :");
                sayi = scanner.nextInt();
                result -= sayi;
            }
            System.out.println("Sonuç :"+result);
        }

    }
    static void carpma(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç Adet Sayı Çarpılacak :");
        int adet = scanner.nextInt();
        int result = 1;
        for (int i=1;i<=adet;i++){
            System.out.print(i+". Sayı :");
            int sayi = scanner.nextInt();
            result *= sayi;
        }
        System.out.println("Sonuç :"+result);
    }
    static void bolme(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Adedi :");
        int adet = scanner.nextInt();
        double result = 1;
        for (int i = 1;i<=adet;i++){
            System.out.print(i+". Sayı :");
            double sayi = scanner.nextDouble();
            if (i != 1 && sayi == 0){
                System.out.println("0 Girilemez!!!");
                continue;
            }
            if (i == 1){
                result = sayi;
                continue;
            }
            result /= sayi;
        }
        System.out.println("Sonuç :"+result);
    }
    static void usluSayi(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban Sayısı :");
        int taban = scanner.nextInt();
        System.out.print("Üs Sayısı :");
        int us = scanner.nextInt();
        int result =(int) Math.pow(taban,us);
        System.out.println("Sonuç :"+result);
    }
    static void faktoriyel(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Faktöriyeli Alınacak Sayı :");
        int sayi = scanner.nextInt();
        int result = 1;
        if (sayi == 0 || sayi == 1){
            result = 1;
        }
        for (int i=1;i<=sayi;i++){
            result *= i;
        }
        System.out.println("Sonuç :"+result);
    }
    static void modAlma(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz :");
        int sayi = scanner.nextInt();
        System.out.print("Mod Değerini Giriniz :");
        int mod = scanner.nextInt();
        int result = sayi % mod;
        System.out.println("Sonuç :"+result);
    }
    static void dikdortgen(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Uzun Kenarı Giriniz :");
        double uzun = scanner.nextDouble();
        System.out.print("Kısa Kenarı Giriniz :");
        double kisa = scanner.nextDouble();
        double cevre = (uzun+kisa)*2;
        double alan = uzun*kisa;
        System.out.println("Dikdörtgenin Çevresi :"+cevre);
        System.out.println("Dikdörtgenin Alanı :"+alan);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n" +
                      "2- Çıkarma İşlemi\n" +
                      "3- Çarpma İşlemi\n" +
                      "4- Bölme İşlemi\n" +
                      "5- Üslü Sayı Hesaplama\n" +
                      "6- Faktöriyel Hesaplama\n" +
                      "7- Mod Alma\n" +
                      "8- Dikdörtgen Alan ve Çevre Hesabı\n" +
                      "0- Çıkış Yap";
        do{
            System.out.println("================");
            System.out.println(menu);
            System.out.print("Yapmak İstediğiniz İşlem :");
            select = scanner.nextInt();
            switch (select){
                case 1:
                    toplama();
                    break;
                case 2:
                    cikarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    usluSayi();
                    break;
                case 6:
                    faktoriyel();
                    break;
                case 7:
                    modAlma();
                    break;
                case 8:
                    dikdortgen();
                    break;
                case 0:
                    System.out.println("Çıkış Yapılıyor");
                    break;
                default:
                    System.out.println("Hatalı İşlem Yapıldı!!");
                    break;
            }
        }while (select != 0);
    }
}
