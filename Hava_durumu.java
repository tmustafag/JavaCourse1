package Giris;

import java.util.Scanner;

public class Hava_durumu {
    public static void main(String[] args) {

        int heat;
        Scanner input = new Scanner(System.in);

        System.out.print("Hava sıcaklığını giriniz : ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.print("Kayak yapabilirsiniz.");
        } else if ((heat >= 5) && (heat < 10)) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if ((heat >= 10) && (heat <= 15)) {
            System.out.print("Sinemaya veya pikniğe gidebilirsiniz");
        } else if ((heat > 15) && (heat >= 25)) {
            System.out.print("Pikniğe gidebilirsiniz");
        } else
            System.out.print("Yüzmeye gidebilirsiniz");
    }
}
