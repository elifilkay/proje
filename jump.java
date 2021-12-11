import java.util.Scanner;

public class jump {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double total;
        int kgMuz; double tutarMuz=0.95;
        int kgElma; double tutarElma=3.67;
        int kgDomates; double tutarDomates=1.11;
        int kgPatlıcan; double tutarPatlıcan=5.00;
        int kgArmut; double tutarArmut=2.14;
        System.out.println("Enter kilos of muz:");
        kgMuz= scanner.nextInt();
        System.out.println("Enter kilos of armut:");
        kgArmut= scanner.nextInt();
        System.out.println("Enter kilos of domates:");
        kgDomates= scanner.nextInt();
        System.out.println("Enter kilos of patlıcan:");
        kgPatlıcan= scanner.nextInt();
        System.out.println("Enter kilos of elma:");
        kgElma= scanner.nextInt();
      total=kgArmut*tutarArmut+kgDomates*tutarDomates+kgElma*tutarElma+kgMuz*tutarMuz+kgPatlıcan*tutarPatlıcan;
        System.out.println("Toplam tutar: "+ total);








    }
}
