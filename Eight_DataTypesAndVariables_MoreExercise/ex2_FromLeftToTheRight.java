package Eight_DataTypesAndVariables_MoreExercise;

import java.util.Scanner;

public class ex2_FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= input; i++) {
            long left = scanner.nextLong();
            long right = scanner.nextLong();
            int sum = 0;
            long biggest = Math.max(left, right);
            while (biggest != 0) {
                sum += biggest % 10;
                biggest /= 10;
            }
            System.out.println(Math.abs(sum));
        }

    }
}
