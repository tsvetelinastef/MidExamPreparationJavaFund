package Five_BasicSyntaxConditionalStatementsLoop_Lab;

import java.util.Scanner;

public class ex10_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum;
        for (int i = 1; i <= 10; i++) {
            sum = i * n;
            System.out.printf("%d X %d = %d%n", n, i, sum);
        }
    }
}
