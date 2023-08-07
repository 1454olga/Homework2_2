public class Main {
    public static void main(String[] args) {
        //task 1

        System.out.println("Задание 1");
        int a = 54321;
        byte b = 64;
        float c = 3.14F;
        short d = -123;
        long k = 986L;
        double l = -1;

        System.out.println("Значение переменной с типом int равно " + a);
        System.out.println("Значение переменной с типом byte равно " + b);
        System.out.println("Значение переменной с типом float равно " + c);
        System.out.println("Значение переменной с типом short равно " + d);
        System.out.println("Значение переменной с типом long равно " + k);
        System.out.println("Значение переменной с типом double равно " + l);

        //task 2
        System.out.println("Задание 2");
        double var1 = 27.12;
        float var2 = 987_678_965_549F;
        double var3 = 2.786;
        int var4 = 569;
        short var5 = -159;
        int var6 = 27897;
        byte var7 = 67;
        System.out.println("task is done");

        //Task 3
        System.out.println("Задание 3");
        int teacher1Student = 23;
        int teacher2Student = 27;
        int teacher3Student = 30;
        int totalCountofPaper = 480;
        System.out.println("На каждого ученика рассчитано " + (totalCountofPaper / (teacher1Student + teacher2Student + teacher3Student)) + " листов бумаги");

        // task 4
        System.out.println ("Задание 4");
        int bottles = 16;
        int minutes = 2;
        int period1 = 20/minutes*bottles;
        int period2 = 24*60/minutes*bottles;
        int period3 = 3*24*60/minutes*bottles;
        int period4 = 30*24*60/minutes*bottles;
        System.out.println("За 20 минут машина произвела " + period1 + " штук бутылок");
        System.out.println("За сутки машина произвела " + period2 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + period3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + period4 + " штук бутылок");

        // task 5
        System.out.println ("Задание 5");
        int pots = 120;
        int whitePots = 2;
        int brownPots = 4;
        int numberofClasses = pots/(whitePots + brownPots);
        int totalofwhitePots = whitePots * numberofClasses;
        int totalofbrownPots = brownPots * numberofClasses;
        System.out.println("В школе, где " + numberofClasses + " классов нужно " + totalofwhitePots + " банок белой краски и "
                + totalofbrownPots + " банок коричневой краски");

        // task 6
        System.out.println ("Задание 6");
        int bananas = 5*80;
        int milk = 200/100*105;
        int iceCream = 2*100;
        int eggs =4*70;
        int totalSum = bananas + milk + iceCream + eggs;
        System.out.println("Сумма в граммах " + totalSum);
        System.out.println("Сумма в граммах " + (totalSum/1000));

        // task 7
        System.out.println ("Задание 7");
        int diffWeightKg = 7;
        int diffWeight = diffWeightKg * 1000;
        int numberofDays1 = diffWeight/250;
        int numberofDays2 = diffWeight/500;

        System.out.println("Потребуется " + numberofDays1);
        System.out.println("Потребуется " + numberofDays2);
        System.out.println("В среднем потребуется " + (numberofDays1 + numberofDays2)/2.0);

        // task 8
        System.out.println ("Задание 8");
        int salaryMaria = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        double increasedsalaryMaria = salaryMaria * 1.1;
        double increasedsalaryDenis = salaryDenis * 1.1;
        double increasedsalaryKristina = salaryKristina * 1.1;

        double diffSalaryMaria = increasedsalaryMaria - salaryMaria;
        double diffSalaryDenis = increasedsalaryDenis - salaryDenis;
        double diffSalaryKristina = increasedsalaryKristina - salaryKristina;

        double diffSalaryMariaPerYear = diffSalaryMaria *12;
        double diffSalaryDenisPerYear = diffSalaryDenis *12;
        double diffSalaryKristinaPerYear = diffSalaryKristina *12;
        System.out.println("Маша теперь получает " + increasedsalaryMaria + "рублей. Годовой доход вырос на " + diffSalaryMariaPerYear + " рублей");
        System.out.println("Денис теперь получает " + increasedsalaryDenis + "рублей. Годовой доход вырос на " + diffSalaryDenisPerYear + " рублей");
        System.out.println("Кристина теперь получает " + increasedsalaryKristina + "рублей. Годовой доход вырос на " + diffSalaryKristinaPerYear + " рублей");
    }
}