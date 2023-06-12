package Giris;

import java.util.Scanner;

public class uslu_sayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, k, total = 1;

        System.out.print("Üssü alınacak sayı : ");
        n = input.nextInt();

        System.out.print("Üs olacak sayı : ");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            total = total * n;
        }
        System.out.print(total);


    }
}
