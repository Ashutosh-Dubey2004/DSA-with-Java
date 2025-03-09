import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = in.nextInt();

        int a = 0;
        int b = 1;
        int c;

        if (num<= 0) {
            System.out.println("Invalid Number");
        }else {
            System.out.print("Febonacci Series :");
                if (num == 1) {
                System.out.println(a);
            }else if(num == 2){
                System.out.println(a + " "+ b);
            }else{
                System.out.print(a + " "+ b + " ");
                for (int i = 3; i <= num; i++) {
                    c = a+b;
                    a=b;
                    b=c;
                    System.out.print(c + " ");
                }
            }
        }

        in.close();
    }
}