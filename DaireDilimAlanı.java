package Giris;
import java.util.Scanner;
public class DaireDilimAlanı {
    public static void main(String[] args) {
        int r,𝛼;
        double π= 3.14;

        Scanner input= new Scanner(System.in);
        System.out.print("Yarıçap Değerini Giriniz :");
        r= input.nextInt();
        System.out.print("Merkez Açı Ölçüsünü Giriniz : ");
        𝛼= input.nextInt();

        double daireCevresi= 2*π*r;
        double daireAlani= π*(r*r);
        double daireDilimAlani= (π*(r*r)*𝛼)/ 360;

        System.out.println("Dairenin Çevresi :" + daireCevresi);
        System.out.println("Dairenin Alanı :" + daireAlani);
        System.out.println("Daire Diliminin Alanı :" + daireDilimAlani);





    }
}
