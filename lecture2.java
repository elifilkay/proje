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
        else {
            System.out.println("Bilgileriniz yanlış!");
            System.out.println("Şifreyi sıfırla!");
            System.out.println("Şifre giriniz:");
             password= scr.nextLine();
             if(password.equals("java123"))
                 System.out.println("Giriş yaptınız tebrikler");






        }
    }
}
