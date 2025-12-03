import java.util.Scanner;

public class D3Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you number(bigger than 1): ");
        int yourNumber = input.nextInt();
        for (int i = 1; i <= yourNumber; i++) {
            System.out.print(i + " ");
        }
        input.close();
    }
}
