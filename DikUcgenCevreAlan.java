package Giris;

import java.util.Scanner;

public class DikUcgenCevreAlan {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int a,b;
        double c;

        System.out.print("Birinci Dikey Kenarı giriniz :");
        a= input.nextInt();

        System.out.print("İkinci Dik Kenarı Giriniz :");
        b= input.nextInt();

        c= ((a*a)+(b*b));
        double hipotenus= (Math.sqrt(c));
        System.out.println("Üçgenin Hipotenüsü :"+hipotenus);

        double cevre= (a+b+hipotenus);

        System.out.println("Üçgenin Çevresi :" + cevre);

        double alan= (a*b)/2;
        System.out.println("Dik Açılı Üçgenin Alanı :" +alan);






    }
}
