package Eight_DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class ex8_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        // за всеки кег чета: модел, радиус, височина
        double maxVolume = Double.MIN_VALUE;
        String maxModelKeg = " "; // моделът на кег, който е с най-голям обем
        for (int keg = 1; keg <= n ; keg++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            // обем = pi * radius ^ 2 * височина
            double volume = Math.PI * Math.pow(radius, 2) * height;

            // проверка дали е max
            if (volume > maxVolume){
                maxVolume = volume;
                maxModelKeg = model;
            }
        }
        System.out.println(maxModelKeg);
    }
}
