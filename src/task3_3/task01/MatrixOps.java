
package task3_3.task01;

public class MatrixOps {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }

        matrixOut(matrix);
        matrixSum(matrix);
        matrixDiagonalSum(matrix);
        matrixRowMax(matrix);
        matrixColumnSum(matrix);
    }

    public static void matrixSum(int[][] matrix) {
        int result = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result += matrix[i][j];
            }
        }

        System.out.println("Сумма всех элементов: " + result);
    }

    public static void matrixDiagonalSum(int[][] matrix) {
        int result = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    result += matrix[i][j];
                }
            }
        }

        System.out.println("Сумма главной диагонали: " + result);

        result = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                if (i + j == 3) {
                    result += matrix[i][j];
                }
            }
        }

        System.out.println("Сумма побочной диагонали: " + result);
    }

    public static void matrixRowMax(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int max = matrix[i][0];

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }

            System.out.println("Максимальный элемент строки " + (i + 1) + ": " + max);
        }
    }

    public static void matrixColumnSum(int[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++) {
            int result = 0;

            for (int i = 0; i < matrix.length; i++) {
                result += matrix[i][j];
            }

            System.out.println("Сумма столбца " + (j + 1) + ": " + result);
        }
    }

    public static void matrixOut(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
