package Twelve_Methods_Exercise;

import java.util.Scanner;

public class ex2_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printVowelsCount(text);
    }

    public static void printVowelsCount(String text) {
        int count = 0; // броя на гласните букви
        for (int index = 0; index <= text.length() - 1; index++) {
            char currentSymbol = text.charAt(index);
            if (currentSymbol == 'a' || currentSymbol == 'e' || currentSymbol == 'i'
                    || currentSymbol == 'o' || currentSymbol == 'u' ||
            currentSymbol == 'A' || currentSymbol == 'E' || currentSymbol== 'I' ||
            currentSymbol== 'O' || currentSymbol == 'U') {
                count++;
            }
        }
        System.out.println(count); // return count;
    }
}
