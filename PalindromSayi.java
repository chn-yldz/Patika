import java.util.Scanner;
public class PalindromSayi{
    static void isPalindrom(int number){
        int ilkDeger = number;
        int uzunluk = String.valueOf(number).length();
        int kalan,deger = 0;
        for (int i =0;i<uzunluk;i++){
            kalan = number % 10;
            deger = (deger*10)+kalan;
            number /= 10;
        }
        if (deger == ilkDeger){
            System.out.println("Palindrom Sayıdır!");
        }else{
            System.out.println("Palindrom Sayı Değildir!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int sayi = scanner.nextInt();
        isPalindrom(sayi);
    }
}