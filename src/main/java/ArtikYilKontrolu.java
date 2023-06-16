import java.util.Scanner;

public class ArtikYilKontrolu {

      /*
    Yıl 4'e tam bölünemiyorsa, artık yıl değildir.
    Ancak, yıl 4'e tam bölünebiliyorsa, aşağıdaki kurallardan birini sağlaması durumunda artık yıldır:
    Yıl 100'e tam bölünebiliyorsa, artık yıl olabilmesi için 400'e de tam bölünmelidir.
    Yıl 100'e tam bölünemiyorsa, sadece 4'e tam bölünmesi yeterlidir.
     */


    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.print("4 basamaklı bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (sayi >= 1000 && sayi <= 9999) {
            int birler = (sayi % 10 + 2) % 10;
            int onlar = ((sayi / 10) % 10 + 2) % 10;
            int yuzler = ((sayi / 100) % 10 + 2) % 10;
            int binler = ((sayi / 1000) % 10 + 2) % 10;

            int yeniSayi = binler * 1000 + yuzler * 100 + onlar * 10 + birler;

            System.out.println("Yeni sayı: " + yeniSayi);
        } else {
            System.out.println("Geçerli bir 4 basamaklı sayı girmediniz.");
        }



        Scanner sc = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        int yil = sc.nextInt();

        boolean artikYil = false;

        if (yil % 4 == 0) {

            if (yil % 100 == 0) {

                if (yil % 400 == 0) {

                    artikYil = true;
                }
            } else {
                artikYil = true;
            }
        }

        if (artikYil) {
            System.out.println(yil + " bir artık yıldır.");
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }
    }
}
