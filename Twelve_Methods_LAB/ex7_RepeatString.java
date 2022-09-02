package Twelve_Methods_LAB;

import java.util.Scanner;

public class ex7_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int repeat = Integer.parseInt(scanner.nextLine());

        String result = newText(text, repeat);
        System.out.println(result);

    }

    public static String newText(String text, int repeat) {
        String output = "";
        for (int i = 0; i < repeat; i++) {
            output += text;
        }
        return output;
    }
}
