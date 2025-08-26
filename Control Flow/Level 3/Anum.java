import java.util.*;

public class Anum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get an integer input from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int sum = 0;

        // Loop through 1 to number-1 to find divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if sum of divisors is greater than the number
        if (sum > number) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }

        
    }
}
