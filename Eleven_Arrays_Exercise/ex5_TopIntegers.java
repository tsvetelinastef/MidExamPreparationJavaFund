package Eleven_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ex5_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        // "1 4 3 2".split(" ") -> ["1","4", "3", "2"]
        // text -> number // parse

        // for every single element -> check if it's top
        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index];
            //винаги ел. на последния индекс ни е топ
            if (index == numbers.length - 1) {
                System.out.println(currentNumber + " ");
                continue;
            }
            boolean isTop = false;
            // следващото число - текущия + 1 (index + 1)
            for (int i = index + 1; i <= numbers.length - 1; i++) {
                int nextNumber = numbers[i];
                if (currentNumber > nextNumber) {
                    isTop = true;
                } else {
                    isTop = false;
                    break;
                }
            }
            // проверка дали числото е топ
            if (isTop) {
                System.out.print(currentNumber + " ");
            }
        }
    }
}
