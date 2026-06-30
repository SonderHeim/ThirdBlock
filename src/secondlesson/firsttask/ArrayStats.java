package secondlesson.firsttask;

import java.util.Arrays;

public class ArrayStats {
    public static void main(String[] args) {
        int[] array = {5, -3, 8, 1, -9, 2, 7, 4};

        System.out.println("Массив: " + Arrays.toString(array));
        sumOfNumbersInArray(array);
        averageArithmetic(array);
        maxAndMinElement(array);
        oddAndEvenElement(array);
        plusAndMinusElements(array);
    }

    public static void sumOfNumbersInArray(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("Сумма: " + sum);
    }

    public static void averageArithmetic(int[] array) {
        double average = 0;

        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }

        System.out.printf("Среднее: " + "%.2f\n", average / array.length);

    }

    public static void maxAndMinElement(int[] array) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, indexMax = 0, indexMin = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
        }

        System.out.println("Максимум: " + max + " (индекс " + indexMax + ")");
        System.out.println("Минимум: " + min + " (индекс " + indexMin + ")");
    }

    public static void oddAndEvenElement(int[] array) {
        int odd = 0, even = 0;

        for (var element : array) {
            if (element % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Четных: " + even + ", нечетных: " + odd);
    }

    public static void plusAndMinusElements(int[] array) {
        int plusNumbers = 0, minusNumbers = 0;

        for (var element : array) {
            if (element > 0) plusNumbers++;
            else if (element < 0) minusNumbers++;
        }

        System.out.println("Положительных: " + plusNumbers + " , отрицательных: " + minusNumbers);
    }
}
