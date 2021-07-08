import java.util.Scanner;

public class SayilarinOrtalamasi{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int sayi = scanner.nextInt();
        int sayac = 0;
        int total = 0;
        for(int i=0;i<sayi;i++){
            if(i % 3 == 0 || i % 4 == 0){
                total +=i;
                sayac++;
            }
        }
        if(sayac != 0){
            double ortalama = total/sayac;
            System.out.println("Ortalama :"+ortalama);
        }
    }
}
