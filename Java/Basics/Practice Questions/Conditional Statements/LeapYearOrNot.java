import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        System.out.println("This program will check if the year in leap year (366 days) or not");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = in.nextInt();

        if ((year%4 == 0 && year%100 != 0) || year%400 == 0){
                System.out.println(year+" is Leap year");
        }else{
            System.out.println(year+" is not Leap year");
        }
        in.close();
    }
}