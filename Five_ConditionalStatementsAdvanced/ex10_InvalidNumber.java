package Five_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class ex10_InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
       if (number >= 100 && number <= 200 || number == 0){

       } else {
           System.out.println("invalid");
       }


    }
}
