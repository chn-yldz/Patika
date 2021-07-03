import java.util.Scanner;
public class KdvHesaplama{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double kdvOrani,kdvliTutar;
        System.out.print("Tutar :");
        double tutar = scanner.nextDouble();
        if(tutar>=0 && tutar<=1000){
            kdvOrani = 18;
            kdvliTutar = tutar*((100+kdvOrani)/100);
            System.out.println("KDV'siz Fiyat :"+tutar);
            System.out.println("KDV'li Fiyat :"+kdvliTutar);
            System.out.println("KDV Tutarı :"+(kdvliTutar-tutar));   
        }else{
            kdvOrani = 8;
            kdvliTutar = tutar*((100+kdvOrani)/100);
            System.out.println("KDV'siz Fiyat :"+tutar);
            System.out.println("KDV'li Fiyat :"+kdvliTutar);
            System.out.println("KDV Tutarı :"+(kdvliTutar-tutar));
        } 
    }
}