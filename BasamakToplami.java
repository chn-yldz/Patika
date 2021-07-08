import java.util.Scanner;
public class BasamakToplami{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı :");
        int sayi = scanner.nextInt();
        int total = 0;
        int counter = 0;
        while (sayi != 0){
            total+=(sayi%10);
            sayi/=10;
            counter++;

        }
        System.out.println(total);
    }
}
