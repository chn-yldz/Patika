import java.util.Scanner;
public class Elmas{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz :");
        int n1=scanner.nextInt();
        int n2=(int)(n1/2)+1;

        for(int i=1;i<=n2;i++)
        {
            for(int j=1;j<=n2-i;j++)
                System.out.print(" ");

            for(int j=1;j<=2*i-1;j++)
                System.out.print("*");

            System.out.println();
        }
        for(int i=n2-1;i>=1;i--)
        {
            for(int j=1;j<=n2-i;j++)
                System.out.print(" ");

            for(int j=1;j<=2*i-1;j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
