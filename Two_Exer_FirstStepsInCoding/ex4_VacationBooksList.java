package Two_Exer_FirstStepsInCoding;

import java.util.Scanner;

public class ex4_VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberPages = Integer.parseInt(scanner.nextLine());
        int pages = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int hours = (numberPages / pages) / days;
        System.out.println(hours);
    }
}
