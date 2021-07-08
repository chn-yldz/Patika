import java.util.Scanner;
public class Kombinasyon{
    public static int faktoriyel(int sayi){
        if(sayi == 0 || sayi == 1){
            return 1;
        }
        return sayi*faktoriyel(sayi-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**
         * C(n,r) = n! / (r! * (n-r)!)
         */
        System.out.print("Kümenin Eleman Sayısı :");
        int elemanSayisi = scanner.nextInt();
        System.out.print("Farklı Grup Sayısı(r) :");
        int r = scanner.nextInt();
        int C = faktoriyel(elemanSayisi)/(faktoriyel(r)*faktoriyel(elemanSayisi-r));
        System.out.println("Sonuç :"+C);
    }
}
