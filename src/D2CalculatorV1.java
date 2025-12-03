import java.util.Scanner;

public class D2CalculatorV1 {
    public static void main(String[] args) {
        //calculator v1

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = input.nextInt();
        System.out.println("Enter second number:");
        int num2 = input.nextInt();
        System.out.println("Enter operation symbol(+,-,/,*):");
        char operator = input.next().charAt(0);

        if (operator == '+') {
            System.out.println("Result: " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("Result: " + (num1 - num2));
        } else if (operator == '/') {
            System.out.println("Result: " + (num1 / num2));
        } else if (operator == '*') {
            System.out.println("Result: " + (num1 * num2));
        } else {
            System.out.println("Invalid operation");
        }
        input.close();


        //calculator v2
    }
}
