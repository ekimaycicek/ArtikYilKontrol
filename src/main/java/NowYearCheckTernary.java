public class NowYearCheckTernary {

    public static void main(String[] args) {


        int yil = 2024;


        if (yil % 400 == 0 || (yil % 4 == 0 && yil % 100 != 0)) {

            System.out.println(yil + " artık yıl");
        } else {
            System.out.println(yil + " artık yıl değil");
        }

    }
}
