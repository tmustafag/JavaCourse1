package Giris;
import java.util.Scanner;
public class dort_ve_besin_kuvvetleri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k;

        System.out.print("Bir sayı giriniz: ");
        k = input.nextInt();

        for (int i = 1; i <= k; i *= 4) {
            System.out.println(i);
        }
        for (int j = 1; j <= k; j *= 5) {
            System.out.println(j);

        }
    }
}
