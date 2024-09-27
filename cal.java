import java.util.Scanner;

public class cal {

    double add(double num1, double num2) {
        return num1 + num2;
    }


    double subtract(double num1, double num2) {
        return num1 - num2;
    }


    double multiply(double num1, double num2) {
        return num1 * num2;
    }

    double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        } else {
            return num1 / num2;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleCalculator calculator = new SimpleCalculator();
        String continueCalculation;

        do {

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("Choose an operation: +, -, *, /");
            char operation = scanner.next().charAt(0);

            double result = 0;
            boolean validOperation = true;


            switch (operation) {
                case '+':
                    result = calculator.add(num1, num2);
                    break;
                case '-':
                    result = calculator.subtract(num1, num2);
                    break;
                case '*':
                    result = calculator.multiply(num1, num2);
                    break;
                case '/':
                    result = calculator.divide(num1, num2);
                    break;
                default:
                    System.out.println("Error: Invalid operation selected.");
                    validOperation = false;
            }

            if (validOperation) {
                System.out.println("The result is: " + result);
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            continueCalculation = scanner.next();

        } while (continueCalculation.equalsIgnoreCase("yes"));

        System.out.println("Calculator terminated.");
        scanner.close();
    }
}

