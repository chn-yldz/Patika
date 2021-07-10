import java.util.Scanner;
public class HarmonikSeri{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Sayısı :");
        int n = scanner.nextInt();
        double result = 0;
        for(int i=1;i<=n;i++){
            result += (1.0/i);
        }
        System.out.println("Sonuç :"+result);
    }
}
