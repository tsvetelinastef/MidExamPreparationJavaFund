package Two_Exer_FirstStepsInCoding;

import java.util.Scanner;

public class ex9_FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        double volumeAquarium = length * width * height;
        double volumeLitters = volumeAquarium / 1000;
        double neededLitters = volumeLitters * (1 - (percentage/ 100));

        System.out.println(neededLitters);
    }
}
