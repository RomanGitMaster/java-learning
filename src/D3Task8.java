import java.util.Scanner;

public class D3Task8 {
    public static void main(String[] args) {
//enter number from 1 to 10, use do while to ask user to do that, if entered other number ask to enter again

        Scanner input = new Scanner(System.in);
        int number;

        do {
            System.out.println("Please enter number between 1 and 10: ");
            number = input.nextInt();
        } while (number < 1 || number > 10);

        System.out.println("You entered: " + number);
        input.close();
    }
}
