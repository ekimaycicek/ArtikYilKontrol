import java.util.Scanner;

public class NowYearCheck {

      /*
    Yıl 4'e tam bölünemiyorsa, artık yıl değildir.
    Ancak, yıl 4'e tam bölünebiliyorsa, aşağıdaki kurallardan birini sağlaması durumunda artık yıldır:
    Yıl 100'e tam bölünebiliyorsa, artık yıl olabilmesi için 400'e de tam bölünmelidir.
    Yıl 100'e tam bölünemiyorsa, sadece 4'e tam bölünmesi yeterlidir.
     */


    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.print("4 enter a digit number: ");
        int number = scanner.nextInt();

        if (number >= 1000 && number <= 9999) {
            int ones = (number % 10 + 2) % 10;
            int them = ((number / 10) % 10 + 2) % 10;
            int faces = ((number / 100) % 10 + 2) % 10;
            int thousands = ((number / 1000) % 10 + 2) % 10;

            int newIssue = thousands * 1000 + faces * 100 + them * 10 + ones;

            System.out.println("new issue: " + newIssue);
        } else {
            System.out.println("You did not enter a valid 4-digit numberz.");
        }



        Scanner sc = new Scanner(System.in);
        System.out.print("enter year: ");
        int year = sc.nextInt();

        boolean leapYear = false;

        if (year % 4 == 0) {

            if (year % 100 == 0) {

                if (year % 400 == 0) {

                    leapYear = true;
                }
            } else {
                leapYear = true;
            }
        }

        if (leapYear) {
            System.out.println(year + " a leap year.");
        } else {
            System.out.println(year + " not a leap year.");
        }
    }
}
