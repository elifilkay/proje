import java.util.Scanner;

public class Soru {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a,b;
        int area;
        double c;
        System.out.println("Enter a first side: ");
        a=scanner.nextInt();
        System.out.println("Enter a second side: ");
        b= scanner.nextInt();
        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs: "+ c);
        area=a*b/2;
        System.out.println("The area of triangle is " + area );


    }
}
