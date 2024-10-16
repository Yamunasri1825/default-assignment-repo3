import java.util.Scanner;

public class Yamuna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Basic Calculator!");
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.println("Select an operation: ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        int choice = scanner.nextInt();

        double result = 0;
        switch (choice) {
            case 1:
                result = add(firstNumber, secondNumber);
                break;
            case 2:
                result = subtract(firstNumber, secondNumber);
                break;
            case 3:
                result = multiply(firstNumber, secondNumber);
                break;
            case 4:
                result = divide(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("The result is: " + result);
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return a / b;
    }
}