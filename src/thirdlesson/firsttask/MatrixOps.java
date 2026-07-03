package thirdlesson.firsttask;

import java.util.Arrays;

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
    }

    public static void matrixSum(int[][] matrix) {
        int result = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result += matrix[i][j];
            }
        }

        System.out.println(result);
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

        System.out.println(result);

        result = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length; j >= 0; j--) {
                if (i + j == 3) {
                    result += matrix[i][j];
                }
            }
        }

        System.out.println(result);
    }

    public static void matrixOut(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
