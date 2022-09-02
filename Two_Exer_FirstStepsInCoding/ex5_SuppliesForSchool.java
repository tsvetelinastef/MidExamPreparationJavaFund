package Two_Exer_FirstStepsInCoding;

import java.util.Scanner;

public class ex5_SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pen = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int dissect = Integer.parseInt(scanner.nextLine());
        double discount = Integer.parseInt(scanner.nextLine());

        double pensPrice = pen * 5.80;
        double markersPrice = markers * 7.20;
        double dissectPrice = dissect * 1.20;
        double allMaterialsPrice = pensPrice + markersPrice + dissectPrice;
        double getAllMaterialsPriceDiscount = allMaterialsPrice - (allMaterialsPrice * (discount/ 100));
        System.out.println(getAllMaterialsPriceDiscount);
    }
}
