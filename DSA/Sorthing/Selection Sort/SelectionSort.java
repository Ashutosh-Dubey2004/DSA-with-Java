import java.util.Arrays;

public class SelectionSort {
    static public void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int lastIndex = arr.length - 1 - i;
            int maxIndex = getMaxIndex(arr, 0 , lastIndex);
            swap(arr, lastIndex, maxIndex);
        }
    }
    static public int getMaxIndex(int[] arr, int start, int end){
        int maxIndex = start;
        for (int i = start+1; i <= end; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    static public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr={3,1,5,4,2,-9,-6,0};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
