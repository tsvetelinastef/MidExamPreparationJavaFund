package Twelve_Methods_Exercise;

import java.util.Scanner;

public class ex4_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        boolean isPasswordValidLength = isPasswordValidLength(password);
        if (!isPasswordValidLength){
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean isPasswordValidContent = isPasswordValidContent(password);
        if (!isPasswordValidContent){
            System.out.println("Password must consist only of letters and digits");
        }

        boolean isValidPasswordCountDigits = isPasswordValidCountDigits(password);
        if (!isValidPasswordCountDigits){
            System.out.println("Password must have at least 2 digits");
        }

        if (isPasswordValidLength && isPasswordValidContent && isValidPasswordCountDigits){
            System.out.println("Password is valid");
        }
    }

    private static boolean isPasswordValidLength(String password){
        return password.length() >= 6 && password.length() <= 10;
    }

    private static  boolean isPasswordValidContent(String password){
        for (char symbol: password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)){
                return  false;
            }
        }
        return  true;
    }

    private static  boolean isPasswordValidCountDigits(String password){
        int count = 0;
        for (char symbol:password.toCharArray()) {
            if (Character.isDigit(symbol)){
                count++;
            }
        }
        return  count >= 2;
    }
}
