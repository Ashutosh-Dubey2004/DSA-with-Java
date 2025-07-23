import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of villages

        int[] energy = new int[n];
        int[] distance = new int[n];

        for (int i = 0; i < n; i++) {
            energy[i] = sc.nextInt();
            distance[i] = sc.nextInt();
        }

        for (int start = 0; start < n; start++) {
            int totalEnergy = 0;
            boolean canComplete = true;

            for (int i = 0; i < n; i++) {
                int idx = (start + i) % n;
                totalEnergy += energy[idx];
                totalEnergy -= distance[idx];

                if (totalEnergy < 0) {
                    canComplete = false;
                    break;
                }
            }

            if (canComplete) {
                System.out.println(start + 1); // 1-based index
                return;
            }
        }
    }
}
