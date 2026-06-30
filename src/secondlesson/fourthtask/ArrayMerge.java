package secondlesson.fourthtask;

import java.util.Arrays;

public class ArrayMerge {
    public static void main(String[] args) {
        int[] firstArray = {1, 5, 7};
        int[] secondArray = {0, 4, 6, 2};

        int[] mergedArray = new int[firstArray.length + secondArray.length];

        int a = 0;
        int b = 0;
        int c = 0;

        while (a < firstArray.length && b < secondArray.length) {
            if (firstArray[a] < secondArray[b]) {
                mergedArray[c] = firstArray[a];
                a++;
            } else {
                mergedArray[c] = secondArray[b];
                b++;
            }
            c++;
        }

        while (a < firstArray.length) {
            mergedArray[c] = firstArray[a];
            a++;
            c++;
        }

        while (b < secondArray.length) {
            mergedArray[c] = secondArray[b];
            b++;
            c++;
        }

        System.out.println("Объединенный массив: " + Arrays.toString(mergedArray));

        for (int i = 0; i < mergedArray.length; i++) {
            for (int j = 0; j < mergedArray.length - 1; j++) {
                if (mergedArray[j] > mergedArray[j + 1]) {
                    int temp = mergedArray[j];
                    mergedArray[j] = mergedArray[j + 1];
                    mergedArray[j + 1] = temp;
                }
            }
        }

        System.out.println("Отсортированный массив: " + Arrays.toString(mergedArray));

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
