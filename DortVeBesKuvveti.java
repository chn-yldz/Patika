import java.util.Scanner;
public class DortVeBesKuvveti{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int sayi = scanner.nextInt();
        for(int i=1;i<sayi;i++){
            if(i % 4 == 0 && i % 5 == 0){
                System.out.println(i);
            }
        }
    }
}
