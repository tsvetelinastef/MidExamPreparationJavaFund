package Two_Exer_FirstStepsInCoding;

import java.util.Scanner;

public class ex6_Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double sumNylon = (nylon + 2) * 1.50;
        double sumPaint = (paint + ((paint * 1.0) * 0.10)) * 14.50;
        double sumThinner = thinner * 5.00;
        // sum bags = 0.40
        double sumAllMaterials = sumNylon + sumPaint + sumThinner + 0.40;
        double sumWorkers = sumAllMaterials * 0.30 * hours;
        double sumAll = sumAllMaterials + sumWorkers;
        System.out.println(sumAll);
    }
}


