package Twelve_Methods_LAB;

import java.util.Scanner;

public class ex4_Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (command){
            case "add":
                add(firstNumber,secondNumber);
                break;
            case "multiply":
                multiply(firstNumber,secondNumber);
                break;
            case "subtract":
                subtract(firstNumber, secondNumber);
                break;
            case "divide":
                divide(firstNumber,secondNumber);
                break;
        }
    }
    public static void add(int firstNumber, int secondNumber){
        int result = firstNumber + secondNumber;
        System.out.println(result);
    }
    public static void multiply(int firstNumber, int secondNumber){
        int result = firstNumber * secondNumber;
        System.out.println(result);
    }
    public static void subtract(int firstNumber, int secondNumber){
        int result = firstNumber - secondNumber;
        System.out.println(result);
    }
    public static void divide(int firstNumber, int secondNumber){
        int result = firstNumber / secondNumber;
        System.out.println(result);
    }
}
