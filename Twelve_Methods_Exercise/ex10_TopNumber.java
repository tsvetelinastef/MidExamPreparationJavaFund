package Twelve_Methods_Exercise;

import java.util.Scanner;

public class ex10_TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        // обхождаме всички числа от 1 до n
        // за всяко число правим проверка дали е топ -> print
        for (int number = 1; number <= n; number++) {
            // сумата от цифрите се дели на 8
            // да има поне 1 нечетна цифра
            if (isSumDigitsDivisible(number) && holdsOddDigit(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isSumDigitsDivisible(int number) {
        // сума от цифрите
        // проверка - сумата се дели на 8 -> true
        //  сумата не се дели на 8 -> false
        int sum = 0;
        while (number > 0) {
            // 1. взимаме последнта цифра
            int lastDigit = number % 10;
            // 2. добавяме към сумата
            sum += lastDigit;
            // 3. премахваме последната цифра
            number = number / 10;
        }
        return sum % 8 == 0;
    }

    // true -> има поне 1 нечетна цифра
    private static boolean holdsOddDigit(int number){
        while (number > 0){
            int lastDigit = number % 10;
            if (lastDigit % 2 == 1){
                return  true;
            }
            number = number/ 10;
        }
        return false;
    }
}
