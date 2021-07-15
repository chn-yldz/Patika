import java.util.Scanner;
public class RecursiveUsAlma {
    static int usAlma(int taban, int us) {
        if (taban == 0) {
            return 0;
        } else if (us == 0) {
            return 1;
        }
        return taban * usAlma(taban, us - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban Değerini Giriniz :");
        int taban = scanner.nextInt();
        System.out.print("Üs Değerini Giriniz :");
        int us = scanner.nextInt();
        if (taban == 0 && us == 0) {
            System.out.println("0 Belirsizliği");
        } else {
            System.out.println("Sonuç :" + usAlma(taban, us));
        }
    }
}
