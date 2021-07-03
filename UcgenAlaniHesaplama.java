import java.util.Scanner;
public class UcgenAlaniHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c,cevre;
        double alan;
        System.out.print("1. Kenar :");
        a = scanner.nextInt();
        System.out.print("2. Kenar :");
        b = scanner.nextInt();
        System.out.print("3. Kenar :");
        c = scanner.nextInt();
        cevre = (a+b+c)/2;
        alan = Math.sqrt(cevre*(cevre-a)*(cevre-b)*(cevre-c));
        System.out.println("Kenarları Girilen Üçgenin Alanı :"+alan+"cm²");
    }
}
