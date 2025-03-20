import java.util.Arrays;

public class CyclicSort {
    static public void cyclicSort(int[] arr){
        int i=0;
        while(i<arr.length) {
            int correctIndex = arr[i] - 1;
            System.out.println(Arrays.toString(arr));
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }
    }
    static public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] nums={2,4,-1,0,5,3};
        cyclicSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}