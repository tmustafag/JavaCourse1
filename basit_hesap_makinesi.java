package Giris;

import java.util.Scanner;

public class basit_hesap_makinesi {
    public static void main(String[] args) {
        Scanner hesap = new Scanner(System.in);
        double n1, n2;
        int select;

        System.out.print("İlk sayınızı giriniz :");
        n1 = hesap.nextDouble();

        System.out.print("İkinci sayınızı giriniz :");
        n2 = hesap.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarma\n4-Bölme");
        System.out.print("Hangi işlemi yapmak istiyorsanız yanındaki sayıyı giriniz :");
        select = hesap.nextInt();

        switch (select){
            case 1:
                System.out.println("İşleminizin sonucu :" + (n1 + n2));
                break;
            case 2:
                System.out.println("İşleminizin sonucu :" + (n1 - n2));
                break;
            case 3:
                System.out.println("İşleminizin sonucu :" + (n1 * n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Sayılar 0'a bölünemez");
                }else {
                    System.out.println("İşleminizin sonucu :" + (n1 / n2));
                }break;
            default:
                System.out.println("Hatalı giriş yaptınız");
        }
    }
}
