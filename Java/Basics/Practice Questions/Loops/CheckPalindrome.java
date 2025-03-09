import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = in.nextInt();
        int temp = num;

        int reverse = 0;
        int rem;
        while (temp>0) {
            rem = temp % 10;
            temp = temp / 10;
            reverse =  reverse * 10 + rem;
        }
        if (num == reverse) {
            System.out.println("Given Number is Palindrome (" + num + " = " + reverse + ")");
        }
        else{
            System.out.println("Given Number not is Palindrome (" + num + " != " + reverse + ")"); 
        }

        in.close();
    }
}
