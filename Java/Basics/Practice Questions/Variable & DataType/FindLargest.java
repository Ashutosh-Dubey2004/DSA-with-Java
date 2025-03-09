import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("This program will find the largest no. among 3 numbers.");

        System.out.print("Enter 1st No. :");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd No. :");
        int num2 = in.nextInt();
        System.out.print("Enter 3rd No. :");
        int num3 = in.nextInt();

        int largestNo = 0;

        // if (num1 > num2) {
        //     if (num1 > num3) {
        //         largestNo = num1;
        //     }else {
        //         largestNo = num3;
        //     }
        // }else if (num2>num3) {
        //     largestNo = num2;
        // }else{
        //     largestNo = num3;
        // }

        if (num1>num2 && num1>num3) {
            largestNo = num1;
        } else if (num2>num1 && num2>num3) {
            largestNo = num2;
        }else{
            largestNo = num3;
        }

        System.out.println("Largest No. is :" + largestNo);
        in.close();
    }
}
