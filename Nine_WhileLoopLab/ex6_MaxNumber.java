package Nine_WhileLoopLab;

import java.util.Scanner;

public class ex6_MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        String text = scanner.nextLine();
        while (!text.equals("Stop")) {
            int number = Integer.parseInt(text);
            if (number > max) {
                max = number;
            }
            text = scanner.nextLine();
        }
        System.out.println(max);
    }
}
