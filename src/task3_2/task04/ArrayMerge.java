package task3_2.task04;

import java.util.Arrays;

public class ArrayMerge {
    public static void main(String[] args) {
        int[] firstArray = {1, 5, 7};
        int[] secondArray = {0, 2, 4, 6};

        int[] mergedArray = new int[firstArray.length + secondArray.length];

        int a = 0;
        int b = 0;
        int c = 0;

        while (c < mergedArray.length) {
            if (b == secondArray.length || (a < firstArray.length && firstArray[a] <= secondArray[b])) {
                mergedArray[c] = firstArray[a++];
            } else {
                mergedArray[c] = secondArray[b++];
            }
            c++;
        }

        System.out.println("Объединенный и отсортированный массив: " + Arrays.toString(mergedArray));

        int evenCount = 0;

        for (int i = 0; i < mergedArray.length; i++) {
            if (mergedArray[i] % 2 == 0) {
                evenCount++;
            }
        }

        int[] evenArray = new int[evenCount];

        int evenIndex = 0;

        for (int i = 0; i < mergedArray.length; i++) {
            if (mergedArray[i] % 2 == 0) {
                evenArray[evenIndex] = mergedArray[i];
                evenIndex++;
            }
        }

        System.out.println("Четные числа в массиве: " + Arrays.toString(evenArray));
    }
}
