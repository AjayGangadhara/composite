import java.util.Scanner;

public class CompositeNumberChecker {

    // Function to check if a number is composite
    public static boolean isComposite(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are neither prime nor composite
        }

        // Check if the number has any divisor other than 1 and itself
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true; // It is a composite number
            }
        }

        return false; // It is a prime number
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isComposite(num)) {
            System.out.println(num + " is a composite number.");
        } else {
            System.out.println(num + " is not a composite number.");
        }

        scanner.close();
    }
}

