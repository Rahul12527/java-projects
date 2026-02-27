import java.util.Scanner;

public class findfactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        if (!sc.hasNextLong()) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }
        long n = sc.nextLong();
        sc.close();
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }
        long fact = 1;
        for (long i = 2; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " = " + fact);
    }
}