package Giris;

import java.util.Scanner;

public class ucak_bileti {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int age, km, type;

        System.out.print("Kaç km cinsinden gideceğiniz mesafeyi giriniz : ");
        km = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();

        System.out.print("Yolculuk türünü giriniz.(Tek Yön ise 1, Gidiş Dönüş ise 2) : ");
        type = input.nextInt();

        double regular = km * 0.10;
        double discount, moreDiscount;

        if (age <= 0) {
            System.out.print("Hatalı giriş yaptınız. Yaşınız pozitif değer olmalıdır.");
        }
        if ((age > 0) && (age < 12)) ;
        discount = regular / 2;
        if (type == 2) {
            moreDiscount = (discount * 80) / 100;
            System.out.print("Toplam ücret tutarı : " + moreDiscount * 2);
        } else if (type == 1) {
            System.out.print("Toplam ücret tutarı : " + discount);
        } else
            System.out.print("Hatalı giriş yaptınız");

        if ((age >= 12) && (age <= 24)) {
            discount = (regular * 90) / 100;
            if (type == 2) {
                moreDiscount = (discount * 80) / 100;
                System.out.print("Toplam ücret tutarı : " + moreDiscount * 2);
            } else if (type == 1) {
                System.out.print("Toplam ücret tutarı : " + discount);
            } else
                System.out.print("Hatalı giriş yaptınız");

        }
        if (age>65) {
            discount=(regular*70)/100;
            if (type == 2) {
                moreDiscount = (discount * 80) / 100;
                System.out.print("Toplam ücret tutarı : " + moreDiscount * 2);
            } else if (type == 1) {
                System.out.print("Toplam ücret tutarı : " + discount);
            } else
                System.out.print("Hatalı giriş yaptınız");
        }
        if ((age>24) && (age<=65)) {
            if (type==2) {
                moreDiscount = (regular*80)/100;
                System.out.print("Toplam ücret tutarı : " + moreDiscount*2);
            }else if (type==1) {
                System.out.print("Toplam ücret tutarı : " + regular);
            }else
                System.out.print("Hatalı giriş yaptınız");
        }
    }
}
