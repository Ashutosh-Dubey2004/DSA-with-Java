public class LinearSearch {
   static boolean check(int[] arr, int target){
      for(int num: arr){
         if(num == target)
            return true;
      }
      return false;
   }

   static int linearSearch(int[] arr, int target){
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] == target) {
            return i;
         }
      }
      return -1;
   }
   public static void main(String[] args) {
      int[] arr = {2,4,3,11,15,1,23,345,65,12};
      int target = 1;
      // System.out.println(check(arr, target));
      System.out.println(linearSearch(arr, target));
   }
}
