import java.util.Scanner;
public class MinMax{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        System.out.print("Kaç Tane Sayı Gireceksiniz :");
        int adet = scanner.nextInt();
        for(int i=1;i<=adet;i++){
            System.out.print(i+". Sayıyı Giriniz :");
            int sayi = scanner.nextInt();
            if (i == 1){
                max = sayi;
                min = sayi;
            }
            if (sayi > max)
                max = sayi;
            if (sayi < min)
                min = sayi;
        }
        System.out.println("En Büyük Sayı :"+max);
        System.out.println("En Küçük Sayı :"+min);

    }
}
