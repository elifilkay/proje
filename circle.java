import java.util.Scanner;



    public class circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int r;
            double pi = 3.14;
            double area;
            int a;
            System.out.println("Enter radius:");
            r = scanner.nextInt();
        System.out.println("Enter your angle:");
        a= scanner.nextInt();
            area=(pi*r*r*a)/360;
        System.out.println("Area of circle is "+ area);





        }

    }

