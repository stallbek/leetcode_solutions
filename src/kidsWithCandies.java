import java.util.ArrayList;
import java.util.List;

public class kidsWithCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> arr = new ArrayList<Boolean>();
        int largest = 0;

        for (int i = 0; i < candies.length; i++){
            if (candies[i] > largest){
                largest = candies[i];
            }
        }

        for (int j = 0; j < candies.length; j++){
            if (candies[j] + extraCandies >= largest){
                arr.add(true);
            }
            else {
                arr.add(false);
            }
        }
        return arr;
    }
}
