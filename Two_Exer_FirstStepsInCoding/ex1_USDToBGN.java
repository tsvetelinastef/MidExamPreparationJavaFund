package Two_Exer_FirstStepsInCoding;

import java.util.Scanner;

public class ex1_USDToBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double value = Double.parseDouble(scanner.nextLine());
        double valueBGN = value * 1.79549;
        System.out.printf("%f", valueBGN);
    }
}
