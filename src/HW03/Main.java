package HW03;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1(){

        System.out.println("Задача 1");
        System.out.println();

        byte one = 8;
        int two = 16;
        short three = 32;
        long four = 64L;
        float five = 128F;
        double six = 512D;

        System.out.println("Значение переменной one с типом byte равно " + one);
        System.out.println("Значение переменной two с типом int равно " + two);
        System.out.println("Значение переменной three с типом short равно " + three);
        System.out.println("Значение переменной four с типом long равно " + four);
        System.out.println("Значение переменной five с типом float равно " + five);
        System.out.println("Значение переменной six с типом double равно " + six);

        System.out.println();
        System.out.println();
    }
    public  static void task2(){
        System.out.println("Задача 2");
        System.out.println();

        double one = 27.12D;
        long two = 987678965549L;
        float three = 2.786F;
        short four = 569;
        int five = -159;
        int six = 27897;
        byte seven = 67;

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);

        System.out.println();
        System.out.println();
    }

    public static void task3(){
        System.out.println("Задача 3");
        System.out.println();

        var studentsInClass1 = 23;
        var studentsInClass2 = 27;
        var studentsInClass3 = 30;
        var totalSheetsNumber = 480;

        var totalStudentsNumber = studentsInClass1 + studentsInClass2 + studentsInClass3;
        var SheetsNumberForOneStudent = totalSheetsNumber / totalStudentsNumber;

        System.out.println("На каждого ученика рассчитано " + SheetsNumberForOneStudent +
             " листов бумаги");
        System.out.println();
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        System.out.println();

        var productivityInTwoMinutes = 16; // Производительность за 2 минуты

        var productivityInOneMinute = productivityInTwoMinutes / 2;

        var productivityInTwentyMinutes = productivityInOneMinute * 20;
        System.out.println("За 20 минут машина произвела " + productivityInTwentyMinutes + " штук " +
                "бутылок");

        var minutesPerDay = 24 * 60;
        var productivityInDay = productivityInOneMinute * minutesPerDay;
        System.out.println("За сутки машина произвела " + productivityInDay + " штук бутылок");

        var productivityIn3Days = productivityInDay * 3;
        System.out.println("За 3 дня машина произвела " + productivityIn3Days + " штук бутылок");

        var productivityInMonth = productivityInDay * 30;
        System.out.println("За месяц машина произвела " + productivityInMonth + " штук бутылок");

        System.out.println();
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");
        System.out.println();

        var totalCansNumber = 120;
        var whitePaintConsumptionPer1Class = 2;
        var brownPaintConsumptionPer1Class = 4;

        var totalClassesNumber = totalCansNumber / (whitePaintConsumptionPer1Class +
                brownPaintConsumptionPer1Class); // Количество классов в школе

        var totalWhitePaint = totalClassesNumber * whitePaintConsumptionPer1Class;
        var totalBrownPaint = totalClassesNumber * brownPaintConsumptionPer1Class;

        System.out.println("В школе, где " + totalClassesNumber + " классов, нужно " +
                totalWhitePaint + " банок белой краски и " + totalBrownPaint +
                " банок коричневой краски");

        System.out.println();
        System.out.println();
    }
}