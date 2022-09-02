package Seventeen_List_LAB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ex3_MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();

        int minSize = Math.min(firstList.size(), secondList.size());
        for (int i = 0; i < minSize; i++) {
            int firstItem = firstList.get(i);
            int secondItem = secondList.get(i);

            resultList.add(firstItem);
            resultList.add(secondItem);
        }

        if (firstList.size() > secondList.size()){
            resultList.addAll(firstList.subList(minSize, firstList.size()));
        } else {
            resultList.addAll(secondList.subList(minSize,secondList.size()));
        }
        System.out.println(resultList.toString().replaceAll("[\\[\\],]", ""));
    }
}

// another way:
//  int index = 0;
//  while (index < firstList.size() || index < secondList.size()) {
//            if (index < firstList.size()) {
//                mergedList.add(firstList.get(index));
//            }
//            if (index < secondList.size()) {
//                mergedList.add(secondList.get(index));
//            }
//            index++;
//        }
//        System.out.println(mergedList.toString().replaceAll("[\\[\\],]", "")
//                .replaceAll(", ", " "));
//    }