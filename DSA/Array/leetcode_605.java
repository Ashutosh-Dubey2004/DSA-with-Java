public class leetcode_605 {
    static public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int num_flowers = 0;
        if (flowerbed.length > 1){
            if (flowerbed[0] == 0 &&flowerbed[1] == 0){
                num_flowers++;
                flowerbed[0] = 1;
            }
            if (flowerbed[flowerbed.length-1] == 0 && flowerbed[flowerbed.length-2] == 0){
                num_flowers++;
                flowerbed[flowerbed.length-1] = 1;
            }
        } 
        else{
            if (flowerbed[0] == 0){
                num_flowers++;
            }
        }
        for (int i = 1; i < flowerbed.length-1; i++){
            if (flowerbed[i] == 0 && flowerbed[i-1] == 0 &&flowerbed[i+1] == 0){
                num_flowers++;
                flowerbed[i] = 1;
            }
        }
        if (n <= num_flowers){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }
}
