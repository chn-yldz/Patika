import java.util.Scanner;
public class SinifGecme{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Matematik Notunuz :");
        int math = scanner.nextInt();
        if(math>100 || math<0){
            math = 0;
        }
        System.out.print("Fizik Notunuz :");
        int physic = scanner.nextInt();
        if(physic>100 || physic<0){
            physic = 0;
        }
        System.out.print("Türkçe Notunuz :");
        int turkish = scanner.nextInt();
        if(turkish>100 || turkish<0){
            turkish = 0;
        }
        System.out.print("Kimya Notunuz :");
        int chem = scanner.nextInt();
        if(chem>100 || chem<0){
            chem = 0;
        }
        System.out.print("Müzik Notunuz :");
        int music = scanner.nextInt();
        if(music>100 || music<0){
            music = 0;
        }
        double average = (math+physic+turkish+chem+music) / 5;
        if(average>=55){
            System.out.println("Sınıfı Geçtiniz");
            System.out.println("Ortalamanız :"+average);
        }else{
            System.out.println("Sınıfta Kaldınız");
            System.out.println("Ortalamanız :"+average);
        }
    }
}
