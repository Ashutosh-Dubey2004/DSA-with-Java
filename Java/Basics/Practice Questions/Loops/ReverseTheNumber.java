import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();

        int reverse = 0;
        int rem;
        while (num>0) {
            rem = num % 10;
            num = num / 10;
            reverse =  reverse * 10 + rem;
        }
        System.out.println("Reverse Number: "+ reverse);
        in.close();
    }
}