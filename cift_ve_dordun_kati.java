package Giris;
import java.util.Scanner;
public class cift_ve_dordun_kati {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int k;
        int total=0;

        do {
            System.out.print("Sayı Giriniz: ");
            k= input.nextInt();
            if ((k%2==0) && (k%4==0)) {
                total+=k;
            }
        } while (k%2==0);
        System.out.print("Toplam = "+total);

    }
}
