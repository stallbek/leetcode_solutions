public class canPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int ones = 0;
        int zeros = 0;


        for (int i = 0; i < flowerbed.length; i++){
            if (flowerbed[i] == 1){
                ones++;
            }
            else {
                zeros++;
            }
        }

        if (zeros - n <= ones){
            return true;
        }
        else {
            return false;
        }
    }
}
