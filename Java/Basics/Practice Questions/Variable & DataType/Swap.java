import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number :");
        int num1 = input.nextInt();

        System.out.print("Enter second number :");
        int num2 = input.nextInt();

        System.out.println("Before Swaping....");
        System.out.println("First no. :"+ num1);
        System.out.println("Second no.:"+ num2);

        // int temp = num1;
        // num1 = num2;
        // num2 = temp;

        // num1 = num1 + num2;
        // num2 = num1 - num2;
        // num1 = num1 - num2;

        // num1 = num1 * num2;
        // num2 = num1 / num2;
        // num1 = num1 / num2;

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("After Swaping....");
        System.out.println("First no. :"+ num1);
        System.out.println("Second no.:"+ num2);
        input.close();
    }
}