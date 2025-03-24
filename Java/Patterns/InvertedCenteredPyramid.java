package Java.Patterns;

public class InvertedCenteredPyramid {
    static void pattern(int n){
        for (int row = 1; row <=n; row++) {
            for (int space = 1; space < row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2*n-2*row+1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern(n);
        System.out.println();
        
        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
