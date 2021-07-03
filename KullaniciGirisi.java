import java.util.Scanner;
public class KullaniciGirisi{
    public static void main(String[] args){
        String password = "sobremesa";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız :");
        String username = scanner.nextLine();
        System.out.print("Şifreniz :");
        String userPassword = scanner.nextLine();
        if(password.equalsIgnoreCase(userPassword)){
            System.out.println("Giriş Başarılı");
            System.out.println("Merhaba "+username);
        }else{
            System.out.print("Hatalı Şifre --> Şifrenizi Sıfırlamak İstermisiniz?(e ya da h) :");
            String choice = scanner.nextLine();
            if(choice.equals("e")) {
                System.out.print("Yeni Şifrenizi Giriniz :");
                String userPassword2 = scanner.nextLine();
                if(userPassword2.equalsIgnoreCase(userPassword) || userPassword2.equalsIgnoreCase(password)){
                    System.out.println("Şifre Oluşturulamadı Lütfen Başka Şifre Giriniz!!");
                }else{
                    System.out.println("Şifre Oluşturuldu");
                    password = userPassword2;
                }
            }else{
                System.out.println("Yeni Şifre Oluşturulmadı");
                System.out.println("Sistemde Kayıtlı Şifre :"+password);
            }
        }
    }
}
