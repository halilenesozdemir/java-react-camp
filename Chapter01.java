public class Chapter01 {
    public static void main(String[] args) {
        // camelCase
        // Don't repeat yourself!
        String internetSubeButonu = "İnternet Şubesine gir";
        System.out.println(internetSubeButonu);
        double dollarYesterday = 8.15;
        double dollarToday = 8.18;
        int installmentCount = 36;
        boolean isReduce = true;

        // Blok açtığımız parantezlere ve blok sonuna ; konulmaz! Blok kapama parantezi zaten sonu anlatır!

        if (dollarToday > dollarYesterday) {
            System.out.println("The dollar is rising");
        } else if (dollarToday < dollarYesterday) {
            System.out.println("The dollar is decreasing");
        } else {
            System.out.println("The values are same");
        }

        String category1 = "Romantik";
        String category2 = "Eğlence";
        String category3 = "Aksiyon";
        String category4 = "Macera";
        String category5 = "Korku";
        String category6 = "Fantastik";

/*        System.out.println(category1);
        System.out.println(category2);
        System.out.println(category3);
        System.out.println(category4);
        System.out.println(category5);
        System.out.println(category6);*/

        String[] categories = {category1, category2, category3, category4, category5, category6};
//        FOR EACH
        for (String category : categories) {
            System.out.println(category);
        }

        //    Primitive vs Reference
        int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 100;
        System.out.println(sayi1);

        int[] sayilar1 = {1, 2, 3, 4, 5};
        int[] sayilar2 = {10, 20, 30, 40, 50};
        sayilar1 = sayilar2;
        sayilar2[0] = 200;
        System.out.println(sayilar1[0]);

        String sehir1 = "Ankara";
        String sehir2 = "İstanbul";
        sehir1 = sehir2;
        sehir2 = "İzmir";
        System.out.println(sehir1 + " " + sehir2);
//        Output:İstanbul, İzmir
    }

}
