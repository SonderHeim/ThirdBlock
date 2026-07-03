package thirdlesson.secondtask;

public class MatrixTransform {
    public static void main(String[] args) {
        int[][] matrix = new int[3][4];
        matrix = fillMatrix(matrix);
        outMatrix(matrix);
        System.out.println();
        int[][] transposedMatrix = transpositionMatrix(matrix);
        outMatrix(transposedMatrix);
        maxMatrix(transposedMatrix);
    }

    public static int[][] transpositionMatrix(int[][] matrix) {
        int[][] newMatrix = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }
        return newMatrix;
    }

    public static void outMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] fillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }

    public static void maxMatrix(int[][] matrix) {
        int element = matrix[0][0], maxRow = 0, maxCol = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > element) {
                    element = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println("Максимальный элемент (в транспонированной матрице): " + element + ". Строка: " + (maxRow + 1) + ". Столбец: " + (maxCol + 1));
    }
}
