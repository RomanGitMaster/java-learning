import java.util.Scanner;

public class D3Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int yourNumber = input.nextInt();
        for (int i = 1; i <= yourNumber; i++) {
            System.out.println(i + " * " + yourNumber + " = " + (i * yourNumber));
        }
        input.close();

    }
}
