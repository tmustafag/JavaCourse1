package Giris;

import java.util.Scanner;

public class ortalama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mat, turkce, fizik, kimya, muzik;

        System.out.print("Matematik notunuz :");
        mat = input.nextInt();

        System.out.print("Türkçe notunuz :");
        turkce = input.nextInt();

        System.out.print("Fizik notunuz :");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz :");
        kimya = input.nextInt();

        System.out.print("Müzik notunuz :");
        muzik = input.nextInt();

        double average = (mat + turkce + fizik + kimya + muzik) / 5;

        if (mat < 0 || mat > 100 || fizik < 0 || fizik > 100 || kimya < 0 || kimya > 100 ||
                turkce < 0 || turkce > 100 || muzik < 0 || muzik > 100) {

            System.out.println("Hatalı giriş yaptınız. Lütfen 0-100 arasında notlar giriniz.");
        } else if (average <= 54) {
            System.out.println("Üzgünüm, sınıfta kaldınız. Ortalamanız :" + average);
        } else
            System.out.println("Tebrikler, sınıfı geçtiniz. Ortalamanız :" + average);
    }
}