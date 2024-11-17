public class Main {
    public static void main(String[] args) {

        // task 1

        System.out.println("Задача 1");
        int total = 0;
        int savings = 15000;
        int monthNumber = 0;

        while (total < 2_459_000) {
            monthNumber++;
            total = total + savings;
            }
        System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + total + " рублей");


        // task 2

        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        i = 10;
        for ( ; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();


        // task 3

        System.out.println("Задача 3");
        var population = 12_000_000;
        var year = 0;
        var birth = 17;
        var death = 8;
        while (year < 10) {
            population = population + (population * birth / 1000) - (population * death / 1000);
            year++;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }


        // task 4

        System.out.println("Задача 4");
        var deposit = 15000;
        var sum = 0.00;

        for (var monthNumber1 = 1; sum < 12_000_000; monthNumber1++) {
            sum = sum + deposit;
            sum = sum + (sum / 100 * 7);
            System.out.printf("Месяц " + monthNumber1 + ", сумма накоплений " + "%.2f\n", sum);
        }


        // task 5

        System.out.println("Задача 5");
        deposit = 15000;
        sum = 0.00;

        for (var monthNumber2 = 1; sum < 12_000_000; monthNumber2++) {
            sum = sum + deposit;
            sum = sum + (sum / 100 * 7);
            if (monthNumber2 % 6 == 0) {
                System.out.printf("Месяц " + monthNumber2 + ", сумма накоплений " + "%.2f\n", sum);
            }
        }


        // task 6

        System.out.println("Задача 6");
        deposit = 15000;
        sum = 0.00;
        var allMonths = 12 * 9;
        var monthNumber3 = 0;

        while (monthNumber3 != allMonths) {
            monthNumber3++;
            sum = sum + deposit;
            sum = sum + (sum / 100 * 7);
            if (monthNumber3 % 6 == 0) {
                System.out.printf("Месяц " + monthNumber3 + ", сумма накоплений " + "%.2f\n", sum);
            }
        }


        // task 7

        System.out.println("Задача 7");
        int friday = 5;
        int daysInAMonth = 31;
        for (; friday <= daysInAMonth; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }


        // task 8

        System.out.println("Задача 8");
        year = 2024;
        var yearsBefore = year - 200;
        var yearsAfter = year + 100;

        for (var years = 0; years <= yearsAfter; years += 79) {
            if (years > yearsBefore) {
                System.out.println(years);
            }
        }

    }
}