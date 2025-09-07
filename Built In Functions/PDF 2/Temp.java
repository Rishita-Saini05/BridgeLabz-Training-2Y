import java.util.Scanner;

public class Temp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Choose an option (1 or 2): ");
        int choice = scanner.nextInt();

        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();

        if (choice == 1) {
            double celsius = fahrenheitToCelsius(temp);
            System.out.println(temp + "°F = " + celsius + "°C");
        } else if (choice == 2) {
            double fahrenheit = celsiusToFahrenheit(temp);
            System.out.println(temp + "°C = " + fahrenheit + "°F");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
