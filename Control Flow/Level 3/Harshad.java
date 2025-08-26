import java.util.*;

public class Harshad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get an integer input from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int sum = 0;
        int temp = number;

        // Calculate the sum of digits
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }

        // Check if number is divisible by the sum of its digits
        if (number % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }

        
    }
}
