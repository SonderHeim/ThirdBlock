package firstlesson.secondtask;

public class YearAndTemperature {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2024));
        System.out.println(celsiusToFahrenheit(40.0));
        System.out.println(fahrenheitToCelsius(104.0));
    }
}
