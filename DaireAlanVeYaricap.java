import java.util.Scanner;
public class DaireAlanVeYaricap{
    final static double PI = 3.14;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yarıçapı Giriniz :");
        double r = scanner.nextDouble();
        System.out.print("Merkez Açı Ölçüsü :");
        double a = scanner.nextDouble();
        double alan = (PI*(r*r)*a)/360;
        double cevre = 2*PI*r;
        System.out.println("Dairenin Çevresi :"+cevre+"cm");
        System.out.println("Dairenin Alanı :"+alan+"cm²");

    }
}
