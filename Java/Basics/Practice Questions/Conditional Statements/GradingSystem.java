import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = in.nextInt();

        if (marks<0 || marks>100) {
            System.out.println("Invalid mark (mark>0 && mark<100)");
        }
        else{
            if (marks>90) {
                System.out.println("A+");
            }else if (marks>80) {
                System.out.println("A");
            }else if (marks>70) {
                System.out.println("B+");
            }else if (marks>60) {
                System.out.println("B");
            }else if (marks>50) {
                System.out.println("C+");
            }else if (marks>40) {
                System.out.println("C");
            }else if (marks>30) {
                System.out.println("D");
            }else{
                System.out.println("F");
            }
        }
        in.close();
    }
}