package Giris;
import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {

        Scanner taksi= new Scanner(System.in);

        double acilis, kmBasi,gidilecekMesafe;

        acilis = 10;
        kmBasi = 2.20;
        System.out.print("Kaç KM gideceğinizi giriniz :");
        gidilecekMesafe= taksi.nextDouble();

        double fiyat = (gidilecekMesafe*kmBasi)+10;

        double odenecekTutar= (fiyat<20)? 20:fiyat;
        System.out.print("Toplam Tutar :" +odenecekTutar);

    }
}
