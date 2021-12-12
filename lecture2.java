import java.util.Scanner;

public class lecture2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Kullanıcı adı giriniz:");
        String userName = scr.nextLine();
        System.out.println("Password giriniz: ");
        String password = scr.nextLine();
        if (userName.equals("patika") && password.equals("java123"))
        System.out.println("Giriş yaptınız!");

             else if(userName.equals("patika")&& !password.equals("java123"))
                 System.out.println("Giris Başarısız.\nGirmiş olduğunuz şifre Hatalidir...");

                System.out.print("Şifrenizi Sıfırlamak ister misiniz?\nEvet icin 1'e\nHayır icin 2'ye basınız:");
                 int secim= scr.nextInt();

                 if (secim==1)
                     System.out.println("Yeni Şifre Oluşturunuz:");
                      String newPassword=scr.nextLine();
                     if (newPassword.equals("java123"))
                         System.out.println("Şifreniz Oluşturulamadı. Lütfen Başka bir şifre giriniz:");
                         newPassword=scr.nextLine();
                         System.out.println("Şifreniz oluşturuldu.Yeni Şifreniz:"+newPassword);

                  if(secim==2)
                     System.out.println("Guncel Şifreniz: java123");

                 else
                     System.out.println("Geçersiz giriş yaptınız..");

        }
    }


