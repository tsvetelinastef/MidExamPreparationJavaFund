package Three_ConditionalStatements;

import java.util.Scanner;

public class ex2_GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        if (numberOne > numberTwo){
            System.out.println(numberOne);
        } else{
            System.out.println(numberTwo);
        }
    }
}
