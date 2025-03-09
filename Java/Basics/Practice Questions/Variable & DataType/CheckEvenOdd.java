import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        System.out.println("This program will check if the given number is even or odd.");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();

        // if (num%2 == 0) {
        //     System.out.println(num +" is even.");
        // }else{
        //     System.out.println(num+" is odd.");
        // }

        if ((num & 1) == 0) {
            System.out.println(num +" is even.");
        }else{
            System.out.println(num+" is odd.");
        }    
        
        in.close();
    } 
}
