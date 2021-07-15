import java.util.Scanner;
public class RecursiveDesen{
    static void desen(int sayi){
        if (sayi<=0){
            System.out.println("Çıktısı :"+sayi);
            return;
        }
        System.out.println("Çıktısı :"+sayi);
        desen(sayi-5);
        System.out.println("Çıktısı :"+sayi);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı :");
        int sayi = scanner.nextInt();
        desen(sayi);

    }
}
