package Giris;

import java.util.Scanner;

public class ucgenAlani {
    public static void main(String[] args) {

        int a , b , c ;
        double u , alan ;
        Scanner kenar = new Scanner(System.in);
        System.out.println("Aşağıdaki Bir Üçgene Ait Kenar Uzunlukları Giriniz : ");

        System.out.print("1. Kenar Uzunluğunu Giriniz : ");
        a = kenar.nextInt();

        System.out.print("2. Kenar Uzunluğunu Giriniz : ");
        b = kenar.nextInt();

        System.out.print("3. Kenar Uzunluğunu Giriniz : ");
        c = kenar.nextInt();

        u = (a + b + c)  / 2.0;

        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Kenarları Verilen Üçgenin Alanı : " + alan);

    }
}
