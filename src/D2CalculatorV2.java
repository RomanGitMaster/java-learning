import java.util.Scanner;

public class D2CalculatorV2 {
    public static void main(String[] args) {
        //calculator v2
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Enter first number:");
            double num1 = input.nextDouble();
            System.out.println("Enter second number:");
            double num2 = input.nextDouble();
            System.out.println("Enter operation:");
            char op = input.next().charAt(0);

            if (op == '/' && num2 == 0) {
                System.out.println("Error:division by zero is not allowed.");
                break;
            }
            switch (op) {
                case '+':
                    System.out.println("Result:" + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Result:" + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Result:" + (num1 * num2));
                    break;
                case '/':
                    System.out.println("Result:" + (num1 / num2));
                    break;
                default:
                    System.out.println("Make sure to enter valid operation");
                    break;
            }

            System.out.println("Do you want to continue?(y/n)");
            char runningChar = input.next().charAt(0);
            switch (runningChar) {
                case 'y':
                    running = true;
                    break;
                case 'n':
                    running = false;
                    System.out.println("Calculator closed.");
                    break;
                default:
                    System.out.println("Invalid input. Ending program");
                    running = false;
                    break;
            }
        }
        input.close();
    }
}
