public class BinarySearch{
    public static void main(String[] args) {
        int[] myArr = {2,4,5,10,12,15,17,19};
        int target = 15;
        System.out.println(binarySearch(myArr, target));
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target)
                return mid;
            
            if(arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}