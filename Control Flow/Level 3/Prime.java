import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number greater than 1: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            System.out.println("Number should be greater than 1.");
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number + " is a Prime Number.");
            } else {
                System.out.println(number + " is NOT a Prime Number.");
            }
        }

        
    }
}
