package Lesson7;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        printResSortChoose(new int[]{});
        printResSortChoose(new int[]{13});
        printResSortChoose(new int[]{7, 5});
        printResSortChoose(new int[]{24, 9, 30, 1});
        printResSortChoose(new int[]{7, 4, 2, 8, 5, 1, 3});
    }

    static void sortChoose(int[] arr) {
        int minVal;
        int posMin;
        for (int i = 0; i < arr.length; i++) {
            minVal = arr[i];
            posMin = i;
            for (int j = (i + 1); j < arr.length; j++) {
                if (arr[j] < minVal){
                    minVal = arr[j];
                    posMin = j;
                }
            }
            if (arr[i] != minVal){
                arr[posMin] = arr[i];
                arr[i] = minVal;
            }

        }
    }

    static void printResSortChoose(int[] arr) {
        String arrStr;
        sortChoose(arr);
        arrStr = Arrays.toString(arr);
        System.out.println("Result array = " + arrStr);
    }
}
