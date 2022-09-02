package Eight_DataTypesAndVariables_LAB;

import java.util.Scanner;

public class ex11_RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length , width, height;
        System.out.print("Length: ");
        length = Double.parseDouble(scanner.nextLine());

        System.out.print("Width: ");
        width = Double.parseDouble(scanner.nextLine());

        System.out.print("Height: ");
        height = Double.parseDouble(scanner.nextLine());

        double volume  = (length * width * height) / 3;
        System.out.printf("Pyramid Volume: %.2f", volume);

    }
}
