import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of terms for Fibonacci sequence: ");
        int terms = scanner.nextInt();

        if (terms <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            generateFibonacci(terms);
        }
    }

    public static void generateFibonacci(int n) {
        int a = 0, b = 1;

        System.out.println("Fibonacci Sequence up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
