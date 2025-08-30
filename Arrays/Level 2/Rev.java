import java.util.Scanner;

public class Rev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int tempNumber = number;
        int count = 0;

        while (tempNumber != 0) {
            tempNumber /= 10;
            count++;
        }

        int[] digits = new int[count];
        tempNumber = number;

        for (int i = 0; i < count; i++) {
            digits[i] = tempNumber % 10;  // digits stored in reverse order already
            tempNumber /= 10;
        }

        System.out.print("Reversed digits: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);  // directly print digits in reverse order
        }
        System.out.println();

        scanner.close();
    }
}
