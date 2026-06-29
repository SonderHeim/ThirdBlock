package firstlesson.firsttask;

public class MathUtils {
    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int clamp(int value, int low, int high) {
        if (value > high) {
            return high;
        } else if (value < low) {
            return low;
        } else {
            return value;
        }
    }

    public static void main(String[] args) {
        System.out.println(min(10, 15));
        System.out.println(max(20, 25));
        System.out.println(clamp(10, -20, 5));
    }
}
