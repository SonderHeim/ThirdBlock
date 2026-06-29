package firstlesson.thirdlesson;

public class FactorialAndPower {
    public static long factorial(int n) {
        long result = 1;

        if (n < 0) {
            throw new IllegalArgumentException();
        }

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static long power(int base, int exp) {
        if (exp < 0) {
            throw new IllegalArgumentException();
        }

        long result = 1;

        for (int i = 0; i < exp; i++) {
            result *= base;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(10));
        System.out.println(power(2, 0));
    }
}
