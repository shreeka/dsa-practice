package problems;

import java.util.Collections;
import java.util.List;

public class CoinChange {
    /*
     Coin Change Problem
Problem: Given a set of coin denominations (like 1, 2, 5) and an amount, find the minimum number of coins that sum up to the amount. If it's not possible to make the amount, return -1.

minimumCoinsToAmount: Greedy approach. Time Complexity = O(nlogn) for sorting + O(m) where m is amount of times in loop to reach amo
     */

    public static int minimumCoinsToAmount(List <Integer> coins, Integer amount) {
        /*
         * Here we can check for invalid input for eg empty list, value is zero
         */

        // Sort coins list in descending order
        coins.sort(Collections.reverseOrder());

        int nextLargestIndex = 0;
        int countCoins = 0;
        while(amount > 0) {
            int coin = coins.get(nextLargestIndex);
            if(coin <= amount) {
                /*
                 * efficientCoins = amount / coin;
                 * countCoins += efficientCoins;
                 * amount -= coin * efficientCoins;
                 */
                countCoins ++;
                amount -= coin;
            }else {
                nextLargestIndex ++;
                if (nextLargestIndex == coins.size()) {
                    return -1;
                }
            }
        }
        return countCoins;
    }

}
