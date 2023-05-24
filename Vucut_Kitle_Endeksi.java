package Giris;
import java.util.Scanner;
public class Vucut_Kitle_Endeksi {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        double boy,kilo;

        System.out.print("Lütfen Kilonuzu giriniz :");
        kilo= input.nextDouble();
        System.out.print("Lütfen Boyunuzu CM cinsinden giriniz :");
        boy= input.nextDouble();

        double indeks= kilo/(boy*boy);
        System.out.print("Vücut Kitle İndeksiniz :" + indeks);

    }
}
