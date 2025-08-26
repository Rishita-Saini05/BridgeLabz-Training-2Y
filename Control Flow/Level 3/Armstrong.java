import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int sum = 0;
        int originalNumber = number;

        // Loop until originalNumber becomes 0
        while (originalNumber != 0) {
            // Get the last digit
            int digit = originalNumber % 10;

            // Calculate cube of the digit and add to sum
            sum += digit * digit * digit;

            // Remove the last digit
            originalNumber = originalNumber / 10;
        }

        // Check if the sum of cubes of digits equals the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }

        
    }
}
