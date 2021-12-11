import java.util.Scanner;

public class shine {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double boy;
        double kütle_indeks;
        double kilo;
        System.out.println("Boy girin:");
        boy=scanner.nextDouble();
        System.out.println("Kilo giriniz:");
        kilo= scanner.nextDouble();
        kütle_indeks=kilo/(boy*boy);
        System.out.println("Vücut kütle indeksiniz: "+ kütle_indeks);





    }
}
