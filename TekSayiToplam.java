import java.util.Scanner;
public class TekSayiToplam{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int sayi;
        do{
            System.out.print("Sayı Giriniz :");
            sayi = scanner.nextInt();
            if(sayi % 2 == 0 && sayi % 4 == 0)
                total += sayi;

        }while(sayi % 2 == 0);
        System.out.println("Toplam :"+total);
    }
}
