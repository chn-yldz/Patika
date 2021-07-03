import java.util.Scanner;
public class HesapMakinesi{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci Sayı :");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci Sayı :");
        int sayi2 = scanner.nextInt();
        System.out.println("1)Toplama\n2)Çıkarma\n3)Çarpma\n4)Bölme");
        System.out.print("Seçiminiz :");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Girilen Sayıların Toplamı :"+(sayi1+sayi2));
                break;
            case 2:
                System.out.println("Girilen Sayıların Farkı :"+(sayi1-sayi2));
                break;
            case 3:
                System.out.println("Girilen Sayıların Çarpımı :"+(sayi1*sayi2));
                break;
            case 4:
                System.out.println("Bölme Sonucu :"+(sayi1/sayi2));
                break;
            default:
                System.out.println("Hatalı İşlem Yapıldı!!");
                break;
        }
    }
}
