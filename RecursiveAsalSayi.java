import java.util.Scanner;
public class RecursiveAsalSayi{
    static boolean asalMi(int sayi,int i){
        if (sayi <= 2)
            return (sayi == 2) ? true:false;
        if (sayi % i == 0)
            return false;
        if (i*i>sayi)
            return true;
        return asalMi(sayi,i+1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int sayi = scanner.nextInt();
        if (asalMi(sayi,2))
            System.out.println(sayi+" Sayısı Asaldır!");
        else
            System.out.println(sayi+" Sayısı Asal Sayı Değildir!");
    }
}
