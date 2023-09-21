import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            // выводим, когда празднуем "День программиста"
            System.out.println("12.09." + year);
        } else {
            System.out.println("13.09." + year);
        }
    }

    public static boolean isLeapYear(int year) {
        // определяем, является ли переданный год високосным
        if (year % 4 == 0 || year % 400 == 0 ) {
            if (year % 100 == 0) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}