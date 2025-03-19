import java.util.Arrays;

public class InsertionSort {
    static public void insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                }else{
                    break;  
                }
            }
        }
    }

    static void insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {  
            int key = arr[i];  // Element to be inserted
            int j = i - 1;

            // Shift elements to the right to make space for the key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;  // Insert key at the correct position
        }
    }

    static public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr={3,1,5,4,2,-9,-6,0};
        // insertionSort(arr);
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
