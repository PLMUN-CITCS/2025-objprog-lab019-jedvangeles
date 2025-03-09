import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        int number = getNonNegativeInteger();
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int number;
        
        while (true) {
            System.out.print("Enter a non-negative integer: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number >= 0) {
                    return number;
                } else {
                    System.out.println("Please enter a non-negative integer.");
                }
            } else {
                System.out.println("Please enter an integer.");
                scanner.next(); 
            }
        }
    }

    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
