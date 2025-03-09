import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();

        int sum = 0;
        int rem;
        while (num>0) {
            rem = num % 10;
            num = num / 10;
            sum = sum + rem;
        }
        System.out.println("Sum of digit: "+ sum);
        in.close();
    }
}
