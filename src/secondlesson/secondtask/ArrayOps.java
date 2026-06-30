package secondlesson.secondtask;

import java.util.Arrays;

public class ArrayOps {
    public static void main(String[] args) {
        int[] array = {2, 0 ,-2, 5, 6, -8, 11};

        System.out.println("Пример для массива: " + Arrays.toString(array));
        arrayPrint(array);
        arrayReverse(array);
        shiftToRight(array);
    }

    public static void arrayPrint(int[] array) {
        System.out.print("Прямой порядок: ");

        for (var element : array){
            System.out.print(element + " ");
        }

        System.out.print("\nОбратный порядок: ");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void arrayReverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int lastElement, firstElement;
            lastElement = array[array.length - 1 - i];
            firstElement = array[i];
            array[i] = lastElement;
            array[array.length - i - 1] = firstElement;
        }

        System.out.println("После переворота: " + Arrays.toString(array));
    }

    public static void shiftToRight(int[] array) {
        int shiftElement = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = shiftElement;

        System.out.println("После сдвига вправо: " + Arrays.toString(array));
    }
}
