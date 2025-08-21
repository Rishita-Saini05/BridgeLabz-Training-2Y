import java.util.Scanner;

class Dis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();

        double yards = feet / 3;          // 1 yard = 3 feet
        double miles = yards / 1760;      // 1 mile = 1760 yards

        
        System.out.println("Distance in yards: " + yards);
        System.out.println("Distance in miles: " + miles);
    }
}