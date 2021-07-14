import java.util.Scanner;
public class EbobEkok{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Sayı :");
        int sayi1 = scanner.nextInt();
        System.out.print("2. Sayı :");
        int sayi2 = scanner.nextInt();
        int ekok;
        int ebob = 1;
        ekok = (sayi1>sayi2) ? sayi1:sayi2;
        while (true){
            if (ekok % sayi1 == 0 && ekok % sayi2 == 0){
                System.out.println("Girilen Sayıların Ekok'u :"+ekok);
                break;
            }
            ekok++;
        }
        while (sayi1 != sayi2){
            if (sayi1>sayi2){
                sayi1 -= sayi2;
            }else{
                sayi2 -= sayi1;
            }

        }
        System.out.println("Girilen Sayıların Ebob'u :"+sayi1);
    }
}
