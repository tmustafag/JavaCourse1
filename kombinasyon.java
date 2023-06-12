package Giris;

import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, r, totalN = 1, totalR = 1,totalT=1;

        System.out.print("İlk sayıyı giriniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            totalN *= i;

        }

        System.out.print("İlk girdiğiniz sayıdan daha küçük bir sayı giriniz: ");
        r = input.nextInt();

        for (int k = 1; k <= r; k++) {
            totalR *= k;
        }

        for (int j = 1;j<=(n-r);j++) {
            totalT*=j;
        }

        double kombinasyon = totalN /(totalR * totalT);
        System.out.print(kombinasyon);


    }
}
