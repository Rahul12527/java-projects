import java.util.Scanner;

public class powerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid base input.");
            sc.close();
            return;
        }
        double base = sc.nextDouble();
        System.out.print("Enter the exponent: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid exponent input.");
            sc.close();
            return;
        }
        double exponent = sc.nextDouble();
        sc.close();

        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power " + exponent + " = " + result);
    }
}