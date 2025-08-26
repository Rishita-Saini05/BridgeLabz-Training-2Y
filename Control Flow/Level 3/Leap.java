import java.util.*;

public class Leap{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        
        if (year < 1582) {
            System.out.println("Invalid year. The Gregorian calendar started in 1582.");
        } else {
            System.out.println("== Using multiple if-else statements ==");
            
            
            if (year % 4 != 0) {
                System.out.println(year + " is NOT a Leap Year.");
            } else if (year % 100 != 0) {
                System.out.println(year + " IS a Leap Year.");
            } else if (year % 400 == 0) {
                System.out.println(year + " IS a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }

            System.out.println("== Using single if with logical operators ==");

            
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " IS a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }

        
    }
}
