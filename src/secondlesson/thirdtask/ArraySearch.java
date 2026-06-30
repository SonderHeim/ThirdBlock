package secondlesson.thirdtask;

import java.util.Arrays;

public class ArraySearch {
    public static void main(String[] args) {
        int[] array = new int[10];
        int targetNumber = 5;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }

        System.out.println("Заданный массив: " + Arrays.toString(array));

        boolean isTargetNumber = false;

        for (int i = 0; i < array.length; i++) {
            if (targetNumber == array[i]) {
                System.out.println("Число: " + array[i] + " найдено по индексу: " + i);
                isTargetNumber = true;
            }
        }

        if (!isTargetNumber) {
            System.out.println("Заданное число не найдено.");
        }

        Arrays.sort(array);

        System.out.println("Отсортированный массив: " + Arrays.toString(array));

        int left = 0;
        int right = array.length - 1;

        isTargetNumber = false;

        while (left <= right) {
            int middle = (left + right) / 2;

            System.out.println("Левая граница: " + left + ", Правая граница: " + right + ", Середина: " + middle);

            if (array[middle] == targetNumber) {
                System.out.println("Число " + targetNumber + " есть в массиве.");
                isTargetNumber = true;
                break;
            }

            if (array[middle] < targetNumber) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        if (!isTargetNumber) {
            System.out.println("Заданное число не найдено.");
        }
    }
}
