package Giris;
import java.util.Scanner;
public class burc_bulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int day, month;

        System.out.print("Doğdunuz ayı sayı kullanarak giriniz : ");
        month = input.nextInt();

        System.out.print("Doğdunuz günü giriniz : ");
        day = input.nextInt();

        if (month == 1) {
            if ((day >= 1) && (day <= 31)) {
                if (day <= 21) {
                    System.out.print("Oğlak Burcusunuz");
                } else
                    System.out.print("Kova Burcusunuz");

            } else
                System.out.println("Geçersiz bir gün girdiniz");

        }
        if (month == 2) {
            if ((day >= 1) && (day <= 28)) {
                if (day <= 19) {
                    System.out.print("Kova Burcusunuz");
                } else
                    System.out.print("Balık Burcusunuz");

            } else
                System.out.println("Geçersiz bir gün girdiniz");
        }
        if (month == 3) {
            if ((day >= 1) && (day <= 31)) {
                if (day <= 20) {
                    System.out.print("Balık Burcusunuz");
                } else
                    System.out.print("Koç Burcusunuz");

            } else
                System.out.println("Geçersiz bir gün girdiniz");
        }
        if (month == 4) {
            if ((day >= 1) && (day <= 30)) {
                if (day <= 20) {
                    System.out.print("Koç Burcusunuz");
                } else
                    System.out.print("Boğa Burcusunuz");

            } else
                System.out.println("Geçersiz bir gün girdiniz");
        }
        if (month == 5) {
            if ((day >= 1) && (day <= 31)) {
                if (day <= 21) {
                    System.out.print("Boğa Burcusunuz");
                } else
                    System.out.print("İkizler Burcusunuz");

            } else
                System.out.println("Geçersiz bir gün girdiniz");
        }
        if (month == 6) {
            if ((day >= 1) && (day <= 30)) {
                if (day <= 22) {
                    System.out.print("İkizler Burcusunuz");
                } else
                    System.out.print("Yengeç Burcusunuz");

            } else
                System.out.println("Geçersiz bir gün girdiniz");
        }
        if (month == 7) {
            if ((day >= 1) && (day <= 31)) {
                if (day <= 22) {
                    System.out.print("Yengeç Burcusunuz");
                } else
                    System.out.print("Aslan Burcusunuz");

            } else
                System.out.println("Geçersiz bir gün girdiniz");
        }
        if (month == 8) {
            if ((day >= 1) && (day <= 31)) {
                if (day <= 22) {
                    System.out.print("Aslan Burcusunuz");
                } else
                    System.out.print("Başak Burcusunuz");

            } else
                System.out.println("Geçersiz bir gün girdiniz");
        }
        if (month == 9) {
            if ((day >= 1) && (day <= 30)) {
                if (day <= 22) {
                    System.out.print("Başak Burcusunuz");
                } else
                    System.out.print("Terazi Burcusunuz");

            } else
                System.out.println("Geçersiz bir gün girdiniz");
        }
        if (month == 10) {
            if ((day >= 1) && (day <= 31)) {
                if (day <= 22) {
                    System.out.print("Terazi Burcusunuz");
                } else
                    System.out.print("Akrep Burcusunuz");

            } else
                System.out.println("Geçersiz bir gün girdiniz");
        }
        if (month == 11) {
            if ((day >= 1) && (day <= 30)) {
                if (day <= 21) {
                    System.out.print("Akrep Burcusunuz");
                } else
                    System.out.print("Yay Burcusunuz");

            } else
                System.out.println("Geçersiz bir gün girdiniz");
        }
        if (month == 12) {
            if ((day >= 1) && (day <= 31)) {
                if (day <= 21) {
                    System.out.print("Yay Burcusunuz");
                } else
                    System.out.print("Oğlak Burcusunuz");

            } else
                System.out.println("Geçersiz bir gün girdiniz");
        }
        if ((month<1) || (month>12)) {
            System.out.print("Geçersiz bir sayı girdiniz. Lütfen tekrar deneyiniz. ");
        }
    }
}