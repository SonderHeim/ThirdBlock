package thirdlesson.fourthtask;

public class PascalTriangle {

    public static void main(String[] args) {
        int n = 8;

        int[][] triangle = createTriangle(n);

        printTriangle(triangle);
        System.out.println();
        rowSum(triangle);
    }

    public static int[][] createTriangle(int n) {
        int[][] triangle = new int[n][];

        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i + 1];

            for (int j = 0; j < triangle[i].length; j++) {
                if (j == 0 || j == triangle[i].length - 1) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }
        }

        return triangle;
    }

    public static void printTriangle(int[][] triangle) {
        int n = triangle.length;

        for (int i = 0; i < triangle.length; i++) {
            for (int space = 0; space < (n - i) * 2; space++) {
                System.out.print(" ");
            }

            for (int j = 0; j < triangle[i].length; j++) {
                System.out.printf("%4d", triangle[i][j]);
            }

            System.out.println();
        }
    }

    public static void rowSum(int[][] triangle) {
        for (int i = 0; i < triangle.length; i++) {
            int sum = 0;
            for (int j = 0; j < triangle[i].length; j++) {
                sum += triangle[i][j];
            }

            int expected = (int) Math.pow(2, i);

            System.out.println("Строка " + (i + 1) + ": сумма элементов = " + sum + ", ожидаемая сумма элементов = " + expected);
        }
    }
}