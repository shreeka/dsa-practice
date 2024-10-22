package problems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CandyDistribution {

    public static int minimumCandies (List<Integer> ratings){
        int ratingsLen = ratings.size();

       int[] candies = new int[ratingsLen];
       Arrays.fill(candies, 1);

        //Two pass greedy approach
        //Left to right pass: comparing rating of child left to current child
        for (int i = 1; i < ratingsLen; i++){
            if(ratings.get(i) > ratings.get(i-1)) {
                int currentCandies = candies[i] + 1;
                if(currentCandies == candies[i-1]) {
                    currentCandies++ ;
                }
                candies[i] = currentCandies;
            }
        }

        //Right to left pass: comparing rating of child right to current child

        for(int i = ratingsLen -2; i >= 0; i--){
            if (ratings.get(i) > ratings.get(i+1)) {
                int currentCandies = candies[i] + 1;
                if(currentCandies == candies[i+1]) {
                    currentCandies++ ;
                }
                candies[i] = currentCandies;
            }
        }




        int minCandies = 0;
        for(int candy: candies) {
            minCandies += candy;
        }

        return minCandies;
    }

}
