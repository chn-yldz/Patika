import java.util.Scanner;
public class UcakBileti{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double mesafeUcret = 0.10;
        double toplamTutar;
        double normalTutar;
        double yasİndirimi;
        double gidisDonus;
        double indirimliTutar;
        System.out.print("Mesafeyi km türünden giriniz :");
        int km = scanner.nextInt();
        System.out.print("Yaşınızı giriniz :");
        int yas = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Yolculuk tipini giriniz (1 ==> Tek Yön, 2 ==> Gidiş Dönüş ) :");
        String yolculuk = scanner.nextLine();
        normalTutar = km*mesafeUcret;        
        if(km < 0 || (yas < 0) || (!yolculuk.equals("1") && !yolculuk.equals("2")) ){
            System.out.println("Hatalı Veri Girdiniz!");
        }else{
            if(yolculuk.equals("1")){
                if(yas < 12){
                    yasİndirimi = normalTutar * 0.50;
                    toplamTutar = normalTutar - yasİndirimi;
                    System.out.println("Toplam Tutar :"+toplamTutar);
                }else if(yas>= 12 && yas <24){
                    yasİndirimi = normalTutar * 0.10;
                    toplamTutar = normalTutar - yasİndirimi;
                    System.out.println("Toplam Tutar :"+toplamTutar);
                    
                }else if(yas > 65){
                    yasİndirimi = normalTutar * 0.30;
                    toplamTutar = normalTutar - yasİndirimi;
                    System.out.println("Toplam Tutar :"+toplamTutar);
                }else{
                    yasİndirimi = 0;
                    toplamTutar = normalTutar - yasİndirimi;
                    System.out.println("Toplam Tutar :"+toplamTutar);
                    
                }
            }else{
                if(yas < 12){
                    yasİndirimi = normalTutar * 0.50;
                    indirimliTutar = normalTutar - yasİndirimi;
                    gidisDonus = indirimliTutar * 0.20;
                    toplamTutar = 2*(indirimliTutar - gidisDonus);
                    System.out.println("Toplam Tutar :"+toplamTutar);
                }else if(yas>= 12 && yas < 24){
                    yasİndirimi = normalTutar * 0.10;
                    indirimliTutar = normalTutar - yasİndirimi;
                    gidisDonus = indirimliTutar * 0.20;
                    toplamTutar = (indirimliTutar - gidisDonus)*2;
                    System.out.println("Toplam Tutar :"+toplamTutar);             
                }else if(yas > 65){
                    yasİndirimi = normalTutar * 0.30;
                    indirimliTutar = normalTutar - yasİndirimi;
                    gidisDonus = indirimliTutar *0.20;
                    toplamTutar = 2*(indirimliTutar -gidisDonus);
                    System.out.println("Toplam Tutar :"+toplamTutar);
                }else{
                    yasİndirimi = 0;
                    indirimliTutar = normalTutar - yasİndirimi;
                    gidisDonus = indirimliTutar * 0.20;
                    toplamTutar = (indirimliTutar - gidisDonus)*2;
                    System.out.println("Toplam Tutar :"+toplamTutar);
                }
        }
    }
  }
}