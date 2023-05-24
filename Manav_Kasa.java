package Giris;
import java.util.Scanner;
public class Manav_Kasa {
    public static void main(String[] args) {
        Scanner unit= new Scanner(System.in);
        double armutfiyat=2.14, elmafiyat=3.67, domatesfiyat=1.11,muzfiyat=0.95, patlicanfiyat=5.00;
        double armut,elma,domates,muz,patlican;
        System.out.print("Kaç Kg armut aldığınızı giriniz :");
        armut= unit.nextDouble();

        System.out.print("Kaç Kg elma aldığınızı giriniz :");
        elma= unit.nextDouble();

        System.out.print("Kaç Kg domates aldığınızı giriniz :");
        domates= unit.nextDouble();

        System.out.print("Kaç Kg muz aldığınızı giriniz :");
        muz= unit.nextDouble();

        System.out.print("Kaç Kg patlıcan aldığınızı giriniz :");
        patlican= unit.nextDouble();

        double toplamTutar= (armut*armutfiyat)+(elma*elmafiyat)+(domates*domatesfiyat)+(muz*muzfiyat)+(patlican*patlicanfiyat);
        System.out.println("Toplam Tutar :" +toplamTutar+ "TL");



    }
}
