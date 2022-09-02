package One_FirstStepsInCoding;

import java.util.Scanner;

public class ex5_GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.printf("Hello, %s!", name);
    }
}
