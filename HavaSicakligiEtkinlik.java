import java.util.Scanner;
public class HavaSicakligiEtkinlik {
    public static void main(String[] args) {
        int heat;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Hava Sıcaklığını Giriniz : ");
        heat = scanner.nextInt();

        if (heat > 25){
            System.out.println("Yüzmeye gidebilirsiniz.");
        }else if (heat >= 5){
            if (heat <= 15){
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            if (heat >= 10){
                System.out.println("Pikniğe gidebilirsiniz.");
            }
        }else{
            System.out.println("Kayak yapabilirsiniz");
        }
    }
}