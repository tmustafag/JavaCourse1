package Giris;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner login = new Scanner(System.in);

        String username, password, reset, newPassword;

        System.out.print("Kullanıcı Adınızı Giriniz :");
        username = login.nextLine();

        System.out.print("Şifrenizi Giriniz :");
        password = login.nextLine();

        if (username.equals("patika") && (password.equals("java123"))) {
            System.out.println("Giriş Yaptınız.");

        } else if (username.equals("patika") || !(password.equals("java123"))) {
            System.out.print("Bilgileriniz hatalı. Şifrenizi yenilemek ister misiniz? e/h ");
            reset = login.nextLine();
            if (reset.equals("e")) {
                System.out.print("Yeni Şifrenizi Giriniz :");
                newPassword = login.nextLine();
                if (newPassword.equals("java123")) {
                    System.out.println("Yeni şifreniz ile eski şifreniz aynı olamaz.Lütfen başka şifre deneyiniz.");

                } else
                    System.out.println("Yeni şifreniz başarıyla oluşturuldu. Tekrar giriş yapmayı deneyiniz.");
            } else if (reset.equals("h")) {
                System.out.println("Lütfen bilgilerinizi kontrol ederek tekrar giriş yapmayı deneyiniz.");
            }
        }

    }
}
