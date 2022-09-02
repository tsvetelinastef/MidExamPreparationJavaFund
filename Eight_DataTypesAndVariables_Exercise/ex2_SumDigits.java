package Eight_DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class ex2_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0; // сума от цифрите
        while(number != 0){
            int lastDigit = number % 10; //получената последна цифра
            sum += lastDigit;
            number = number / 10;
        }
        System.out.println(sum);
    }
}

// other way
/*
        sc + Tab;
        int input = Integer.parseInt(scanner.nextLine());
        int lengthOfInt = String.valueOf(input).length();
        int currentNum = 0;
        int sumOfDigit = 0;
        for(int i = 0; i < lengthOfInt; i++){
            currentNum = input % 10;
            sumOfDigit = sumOfDigit + currentNum;
            input = input / 10;
        }
        System.out.println(sumOfDigit);
     }
 }

// other way
        sc + Tab;
        String num = scanner.nextLine();
        int sum = 0;
        for(int i = 0; i <= num.length() - 1; i++){
            char n = num.charAt(i);
            int n01 = Integer.parseInt(String.valueOf(n));
            sum += n01;
        {
        System.out.printf("%d", sum);
    }
}
 */
// ....  :/
