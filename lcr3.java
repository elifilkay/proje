import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class lcr3 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int mat,fızık,muzık,kımya,turkce;
        int grade = 0;
        double average;
        System.out.println("matematik notunuzu girin:");
         mat= scr.nextInt();
        System.out.println("fizik notunuzu girin:");
         fızık= scr.nextInt();
        System.out.println("kimya notunuzu girin:");
         kımya= scr.nextInt();
        System.out.println("müzik notu girin:");
         muzık= scr.nextInt();
        System.out.println("türkçe notu girin:");
         turkce= scr.nextInt();

        average=(mat+fızık+kımya+turkce+muzık)/5;
           if(average>=55)
            System.out.println(" Sınıfı Geçtiniz");
           else
             System.out.println("Üzgünüz, geçemediniz");
        System.out.println("Ortalamanız:" + average);
    }

}
