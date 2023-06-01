package Giris;

import java.util.Scanner;

public class buyukten_kucuge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.print("1. sayı :");
        a = input.nextInt();

        System.out.print("2. sayı :");
        b = input.nextInt();

        System.out.print("3. sayı :");
        c = input.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.print("a>b>c");
            } else
                System.out.print("a>c>b");
        } else if ((b > a) && (b > c)) {
            if (c > a) {
                System.out.print("b>c>a");
            } else
                System.out.print("b>a>c");
        } else if ((c > a) && (c > b)) {
            if (a > b) {
                System.out.print("c>a>b");
            } else
                System.out.println("c>b>a");

        }
    }

}

