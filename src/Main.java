public class Main {
    public static void main(String[] args) {

        // Задача 1
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println(); // пустая строчка

        // Задача 2
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println(); // пустая строчка

        // Задача 3
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.print(i + " ");
        }

        System.out.println(); // пустая строчка

        // Задача 4
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }

        System.out.println(); // пустая строчка

        // Задача 5
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.print(year + " ");
        }

        System.out.println(); // пустая строчка

        // Задача 6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }

        System.out.println(); // пустая строчка

        // Задача 7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }

        System.out.println(); // пустая строчка

        // Задача 8
        int sum = 0;
        int monthlyAddition = 29000;
        for (int month = 1; month <= 12; month++) {
            sum = sum + monthlyAddition;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }

        System.out.println(); // пустая строчка

        // Задача 9
        double sumInBank = 0;
        double interest = 1.01;
        for (int month = 1; month <= 12; month++) {
            sumInBank = (sumInBank + monthlyAddition) * interest;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей", month, sumInBank ); // были некрасивые доли копеек, пришлось погуглить
            System.out.println();
        }

        System.out.println(); // пустая строчка

        // Задача 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + 2*i);
        }
    }
}