import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

            int greater=candies[0];
            List<Boolean> check = new ArrayList<>();
            int n=candies.length;
            for(int i=1;i<n;i++){
                if(candies[i]>greater){
                    greater=candies[i];
                }
            }

            for(int i=0;i<n;i++){
                if(candies[i]+extraCandies<greater){
                    check.add(false);
                }
                else{

                    check.add(true);
                }
            }
            return check;
        }



}
