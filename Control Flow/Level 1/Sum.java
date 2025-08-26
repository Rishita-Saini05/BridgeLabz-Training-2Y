import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double number;

        System.out.println("Enter numbers to sum :");
        number = scanner.nextDouble();

        while (number != 0) {
            total += number;
            number = scanner.nextDouble();
        }

        System.out.println("Total sum is: " + total);
    }
}
