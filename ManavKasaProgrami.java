import java.util.Scanner;
public class ManavKasaProgrami{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5;
        System.out.print("Armut Kaç Kilo :");
        int kiloArmut = scanner.nextInt();
        System.out.print("Elma Kaç Kilo :");
        int kiloElma = scanner.nextInt();
        System.out.print("Domates Kaç Kilo :");
        int kiloDomates = scanner.nextInt();
        System.out.print("Muz Kaç Kilo :");
        int kiloMuz = scanner.nextInt();
        System.out.print("Patlıcan Kaç Kilo :");
        int kiloPatlican = scanner.nextInt();
        double toplamUcret = (armut*kiloArmut)+(elma*kiloElma)+(domates*kiloDomates)+(muz*kiloMuz)+(patlican*kiloPatlican);
        System.out.println("Toplam Tutar :"+toplamUcret+"₺");


    }
}
