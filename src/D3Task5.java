import java.util.Scanner;

public class D3Task5 {
    public static void main(String[] args) {
        //Calculate sum of numbers from the 1 to the number provided by user.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number(bigger than 1): ");
        int yourNumber = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= yourNumber; i++) {
            sum += i;
        }
        System.out.println("The sum is :" + sum);

        input.close();
    }
}
