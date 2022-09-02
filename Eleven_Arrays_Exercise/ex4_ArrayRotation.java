package Eleven_Arrays_Exercise;

import java.util.Scanner;

public class ex4_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] newArr = new String[arr.length];
            newArr[newArr.length - 1] = arr[0];
            System.arraycopy(arr, 1, newArr, 0, arr.length - 1);
            arr = newArr;
        }
        System.out.println(String.join(" ", arr));
    }
}


//        String input = scanner.nextLine(); // text-> numbers "51 47 32 61 21"
//        String[] array = input.split(" ");
//        int countRotation = Integer.parseInt(scanner.nextLine());
//
//        for (int rotation = 1; rotation <= countRotation - 1; rotation++) {
//            // ротация на масива
//            // 1. взимам първия елемент - 51
//            String firstElement = array[0];
//
//            // 2.местя всички елементи на ляво - 47 32 61 21 21
//            // обхождам всички индекси
//            for (int index = 0; index <= array.length - 1 ; index++) {
//                array[index] = array[index + 1];
//            }
//            // 3. задавам последния елемент в масива да ми е = на първия
//            // последния индекс дълж на масива - 1
//            array[array.length - 1] = firstElement;
//        }
//        // отпечатай масива
//        for(String element : array){
//            System.out.print(element + " ");
//        }
