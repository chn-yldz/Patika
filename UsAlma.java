import java.util.Scanner;
public class UsAlma{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı :");
        int sayi = scanner.nextInt();
        System.out.print("Üs :");
        int us = scanner.nextInt();
        int multiply = 1;
        for(int i=1;i<=us;i++){
            multiply*=sayi;
        }
        System.out.println(multiply);
    }
}
