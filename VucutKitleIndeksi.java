import java.util.Scanner;
public class VucutKitleIndeksi{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Boyunuzu Giriniz(metre) :");
        double boy = scanner.nextDouble();
        System.out.print("Kilonuzu Giriniz :");
        int kilo = scanner.nextInt();
        double vki = kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz :"+vki);
    }
}
