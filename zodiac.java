package Giris;

import java.util.Scanner;

public class zodiac {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int year;
        System.out.print("Doğum yılınızı giriniz : ");
        year = input.nextInt();

        if ((year % 12 == 0)) {
            System.out.print("Çin Zodyağı Burcunuz: Maymun");
        }
        if ((year % 12 == 1)) {
            System.out.print("Çin Zodyağı Burcunuz: Horoz");
        }
        if ((year % 12 == 2)) {
            System.out.print("Çin Zodyağı Burcunuz: Köpek");
        }
        if ((year % 12 == 3)) {
            System.out.print("Çin Zodyağı Burcunuz: Domuz");
        }
        if ((year % 12 == 4)) {
            System.out.print("Çin Zodyağı Burcunuz: Fare");
        }
        if ((year % 12 == 5)) {
            System.out.print("Çin Zodyağı Burcunuz: Öküz");
        }
        if ((year % 12 == 6)) {
            System.out.print("Çin Zodyağı Burcunuz: Kaplan");
        }
        if ((year % 12 == 7)) {
            System.out.print("Çin Zodyağı Burcunuz: Tavşan");
        }
        if ((year % 12 == 8)) {
            System.out.print("Çin Zodyağı Burcunuz: Ejderha");
        }
        if ((year % 12 == 9)) {
            System.out.print("Çin Zodyağı Burcunuz: Yılan");
        }
        if ((year % 12 == 10)) {
            System.out.print("Çin Zodyağı Burcunuz: At");
        }
        if ((year % 12 == 11)) {
            System.out.print("Çin Zodyağı Burcunuz: Koyun");
        }
    }
}
