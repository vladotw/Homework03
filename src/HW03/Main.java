package HW03;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
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

        int studentsInClass1 = 23;
        int studentsInClass2 = 27;
        int studentsInClass3 = 30;
        int totalSheetsNumber = 480;

        int totalStudentsNumber = studentsInClass1 + studentsInClass2 + studentsInClass3;
        int SheetsNumberForOneStudent = totalSheetsNumber / totalStudentsNumber;

        System.out.println("На каждого ученика рассчитано " + SheetsNumberForOneStudent +
             " листов бумаги");
        System.out.println();
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        System.out.println();

        int productivityInTwoMinutes = 16; // Производительность за 2 минуты

        int productivityInOneMinute = productivityInTwoMinutes / 2;

        int productivityInTwentyMinutes = productivityInOneMinute * 20;
        System.out.println("За 20 минут машина произвела " + productivityInTwentyMinutes + " штук " +
                "бутылок");

        int minutesPerDay = 24 * 60;
        int productivityInDay = productivityInOneMinute * minutesPerDay;
        System.out.println("За сутки машина произвела " + productivityInDay + " штук бутылок");

        int productivityIn3Days = productivityInDay * 3;
        System.out.println("За 3 дня машина произвела " + productivityIn3Days + " штук бутылок");

        int productivityInMonth = productivityInDay * 30;
        System.out.println("За месяц машина произвела " + productivityInMonth + " штук бутылок");

        System.out.println();
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");
        System.out.println();

        int totalCansNumber = 120;
        int whitePaintConsumptionPer1Class = 2;
        int brownPaintConsumptionPer1Class = 4;

        int totalClassesNumber = totalCansNumber / (whitePaintConsumptionPer1Class +
                brownPaintConsumptionPer1Class); // Количество классов в школе

        int totalWhitePaint = totalClassesNumber * whitePaintConsumptionPer1Class;
        int totalBrownPaint = totalClassesNumber * brownPaintConsumptionPer1Class;

        System.out.println("В школе, где " + totalClassesNumber + " классов, нужно " +
                totalWhitePaint + " банок белой краски и " + totalBrownPaint +
                " банок коричневой краски");

        System.out.println();
        System.out.println();
    }

    public static void task6() {
        System.out.println("Задача 6");
        System.out.println();

        int bananasNumbers = 5;             // к-во бананов
        int oneBananaWeight = 80;           // вес одного банана
        int milk = 200;                     // всего мл молока
        double milkWeight100G = 105D;       // вес 100 мл молока
        int iceCream = 2;                   // к-во брикетов мороженого
        int iceCream1BriquetteWeight = 100; // вес одного брикета мороженого
        int eggs = 4;                       // к-во яиц
        int oneEggWieght = 70;              // вес одного яйца

        double milkWeight1G = milkWeight100G / 1000D;

        double totalWeightG = (bananasNumbers * oneBananaWeight) + (milk * milkWeight1G) +
                (iceCream * iceCream1BriquetteWeight) + (eggs * oneEggWieght);
        double totalWeightKg = totalWeightG / 1000;
        System.out.println("Общий вес спортзавтрака равен " + totalWeightG + " г (" + totalWeightKg +
                " кг)");

        System.out.println();
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача 7");
        System.out.println();

        int totalWeightLostNeedKg = 7;  // всего нужно сбросить в кг
        int weightLostPerDay1 = 250;    // 1-й вариант похужения г/д
        int weightLostPerDay2 = 500;    // 2-й вариант похужения г/д

        int totalWeightLostNeedG = totalWeightLostNeedKg * 1000; // всего нужно сбросить в г
        int daysNeed1 = totalWeightLostNeedG / weightLostPerDay1; // к-во дней при похудении
                                                                  // на 250 г/д
        int daysNeed2 = totalWeightLostNeedG / weightLostPerDay2; // к-во дней при похудении
                                                                  // на 500 г/д

        System.out.println("При похудении на 250 г в день процесс займёт " + daysNeed1 +
                            " дней");
        System.out.println("При похудении на 500 г в день процесс займёт " + daysNeed2 +
                " дней");
        System.out.println();
        System.out.println();

    }

    public static void task8() {
        System.out.println("Задача 8");
        System.out.println();

        double salaryMasha = 67760; // нынешняя ЗП Маши
        double salaryDenis = 83690; // нынешняя ЗП Дениса
        double salaryKristina = 76230; // нынешняя ЗП Кристины

        double raisSalaryMasha = salaryMasha + ((salaryMasha / 100) * 10);
        double raisSalaryDenis = salaryDenis + ((salaryDenis / 100) * 10);
        double raisSalaryKristina = salaryKristina + ((salaryKristina / 100) * 10);

        double yearIncomeDifferenceMasha = (raisSalaryMasha - salaryMasha) * 12;
        double yearIncomeDifferenceDenis = (raisSalaryDenis - salaryDenis) * 12;
        double yearIncomeDifferenceKristina = (raisSalaryKristina - salaryKristina) * 12;

        System.out.println("Маша теперь получает " + raisSalaryMasha + " рублей. Годовой " +
                "доход вырос на " + yearIncomeDifferenceMasha + " рублей.");
        System.out.println("Денис теперь получает " + raisSalaryDenis + " рублей. Годовой " +
                "доход вырос на " + yearIncomeDifferenceDenis + " рублей.");
        System.out.println("Кристина теперь получает " + raisSalaryKristina + " рублей. " +
                "Годовой доход вырос на " + yearIncomeDifferenceKristina + " рублей.");
    }
}