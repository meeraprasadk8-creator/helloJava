import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        double a, b;

        System.out.println("=== CALCULATOR MENU ===");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Power");
        System.out.println("7. Square Root");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        System.out.print("Enter first number: ");
        a = sc.nextDouble();

        System.out.print("Enter second number: ");
        b = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Result = " + (a + b));
                break;

            case 2:
                System.out.println("Result = " + (a - b));
                break;

            case 3:
                System.out.println("Result = " + (a * b));
                break;

            case 4:
                if (b != 0)
                    System.out.println("Result = " + (a / b));
                else
                    System.out.println("Division by zero is not possible");
                break;
            case 5:
                     System.out.println("Result = " + (a % b));
                break;

            case 6:
                     System.out.println("Result = " + Math.pow(a, b));
                break;

            case 7:
                     System.out.println("Square Root of first number = " + Math.sqrt(a));
                 break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}