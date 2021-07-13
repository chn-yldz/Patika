import java.util.Scanner;
public class ATM{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int choice;
        int yatirma;
        int cekme;
        while (right>0){
            System.out.print("Kullanıcı Adınız :");
            String userName = scanner.nextLine();
            System.out.print("Parolanız :");
            String password = scanner.nextLine();
            if (userName.equals("admin") && password.equalsIgnoreCase("admin")){
                System.out.println("Merhaba CivCiv Bankasına Hoşgeldiniz");
                do{
                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkış");
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz :");
                    choice = scanner.nextInt();
                    switch (choice){
                        case 1:
                            System.out.print("Yatırmak İstediğiniz Tutar :");
                            yatirma = scanner.nextInt();
                            balance += yatirma;
                            break;
                        case 2:
                            System.out.print("Çekmek İstediğiniz Tutar :");
                            cekme = scanner.nextInt();
                            if(cekme>balance){
                                System.out.println("Hesabınızda Yeterli Bakiye Bulunmamaktadır!");
                                System.out.println("Bakiyeniz :"+balance);
                                break;
                            }else{
                                balance -= cekme;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz :"+balance+"₺");
                            break;
                    }
                }while (choice != 4);
                System.out.println("İyi Günler,Tekrar Görüşmek Üzere");
                break;

            }else{
                right--;
                System.out.println("Hatalı Kullanıcı Adı veya Parola ==> Tekrar Deneyiniz!!");
                if(right == 0){
                    System.out.println("Hesabınız Bloke Olmuştur,Lütfen Banka İle İletişime Geçiniz!!");
                }else{
                    System.out.println("Kalan Giriş Hakkınız :"+right);
                }
            }
        }
    }
}