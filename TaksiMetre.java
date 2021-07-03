import java.util.Scanner;
public class TaksiMetre{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double toplamUcret = 10;
        double perKm = 2.20;
        System.out.print("Mesafeyi Giriniz(Km) :");
        int kiloMetre = scanner.nextInt();
        toplamUcret += perKm*kiloMetre;
        if(toplamUcret<20){
            System.out.println("Ödenecek Tutar : 20₺");
        }else {
            System.out.println("Ödenecek Tutar :" + toplamUcret + "₺");
        }
    }
}
