import java.util.Scanner;

public class udemy1 {
    // kullanıcıdan alınan iki sayının ebobunu bulma.
    public static int ebobBulma(int n1, int n2){
        int ebob=1;
        for(int i=1;i<n1&&i<n2;i++){
            if((n1%i==0)&&(n2%i==0)) {
                ebob=i;
            }

            }
        return ebob;


        }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz:");
         int birinci_sayı=scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        int ikinci_sayı= scanner.nextInt();
        System.out.println("İki sayının ebobu " +ebobBulma( birinci_sayı,ikinci_sayı));



    }


    }

