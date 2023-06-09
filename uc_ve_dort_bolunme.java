package Giris;

import java.util.Scanner;

public class uc_ve_dort_bolunme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k, toplam = 0, sayi = 0;

        System.out.print("Bir sayı giriniz:");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                toplam += i;
                sayi+=1;
            }
        }
        double ortalama = (toplam / sayi);
        System.out.print("0'dan girdiğiniz sayı arasındaki sayılardan 3'e ve 4'e tam bölünenlerin ortalaması : " + ortalama);

    }
}
