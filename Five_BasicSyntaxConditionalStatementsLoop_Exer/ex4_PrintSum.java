package Five_BasicSyntaxConditionalStatementsLoop_Exer;

import java.util.Scanner;

public class ex4_PrintSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. принтираме числата в даден интервал
        // 2. намираме сумата
        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int number = startNumber; number <= endNumber; number++) {
            System.out.print(number + " ");
            sum += number;
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
