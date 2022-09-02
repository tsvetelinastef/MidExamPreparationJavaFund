package Twelve_Methods_LAB;

import java.util.Scanner;

public class ex9_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        switch (type) {
            case "int":
                System.out.println(getMax(Integer.parseInt(first), Integer.parseInt(second)));
                break;
            case "char":
                System.out.println(getMax(first.charAt(0), second.charAt(0)));
                break;
            case "string":
                System.out.println(getMax(first, second));
                break;
        }
    }

    static int getMax(int first, int second) {
        return Math.max(first, second);
    }

    static char getMax(char first, char second) {
        return (char) Math.max(first, second);
    }

    static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }
}


// String type = scanner.nextLine();
//        switch (type) {
//            case "int":
//                int firstNumber = Integer.parseInt(scanner.nextLine());
//                int secondNumber = Integer.parseInt(scanner.nextLine());
//                System.out.println(getMax(firstNumber, secondNumber));
//                break;
//            case "char":
//                char firstChar = scanner.nextLine().charAt(0);
//                char secondChar = scanner.nextLine().charAt(0);
//                System.out.println(getMax(firstChar, secondChar));
//                break;
//            case "String":
//                String firstString = scanner.nextLine();
//                String secondString = scanner.nextLine();
//                System.out.println(getMax(firstString, secondString));
//                break;
//        }
//    }
//
//    public static int getMax(int firstNumber, int secondNumber) {
//        if (firstNumber > secondNumber) {
//            return firstNumber;
//        }
//        return secondNumber;
//    }
//
//    public static char getMax(char firstChar, char secondChar) {
//        if (firstChar > secondChar) {
//            return firstChar;
//        }
//        return secondChar;
//    }
//
//    public static String getMax(String firstString, String secondString) {
//        String maxText = "";
//        if (firstString.compareTo(secondString) > 0) {
//            maxText = firstString;
//        } else {
//            maxText = secondString;
//        }
//        return maxText;


