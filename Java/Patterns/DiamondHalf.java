package Java.Patterns;

public class DiamondHalf {
    static void pattern(int n){
        // for (int row = 1; row <= 2 * n - 1; row++) {
        //     int totalCols = (row <= n) ? row : (2 * n - row);
        //     for (int col = 1; col <= totalCols; col++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        for (int row = 1; row <= 2*n-1; row++) {
            if (row<=n) {  
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
            }else{
                for (int col = 1; col <= 2 * n - row ; col++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern(n);
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
