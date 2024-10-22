package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * ### **Bus Tickets**
 *
 * - **Problem**: A bus company offers three types of tickets: 1-day pass, 7-day pass, and 30-day pass. You are given a list of days when a customer plans to travel, and you need to calculate the minimum cost required to purchase the tickets to cover all travel days.
 * - **Input**: List of integers representing days of travel and ticket prices for 1-day, 7-day, and 30-day passes.
 */
public class BusTickets {

    // Solved using dynamic programming approach
    public static int minimumCost(List<Integer> days, List <Integer> price) {
        int maxDay = days.getLast();
        List <Integer> dpMinCost = new ArrayList<>();
        int oneDayPass = price.get(0);
        int sevenDayPass = price.get(1);
        int thirtyDayPass = price.get(2);
        int costOneDayPass;
        int costSevenDayPass =  Integer.MAX_VALUE;
        int costThirtyDayPass =  Integer.MAX_VALUE;
        int minDayPrice = 0;
        dpMinCost.add(0);

        for (int i = 1; i <= maxDay; i++) {
            costOneDayPass = dpMinCost.get(i - 1) + oneDayPass;

            if (i - 7 >= 0) {
                costSevenDayPass = dpMinCost.get(i - 7) + sevenDayPass;
            }

            if (i - 30 >= 0) {
                costThirtyDayPass = dpMinCost.get(i - 30) + thirtyDayPass;
            }

            minDayPrice = Math.min(costThirtyDayPass,Math.min(costOneDayPass,costSevenDayPass));

            //check if day is a travel day
            if (days.contains(i)) {
                dpMinCost.add(minDayPrice);
            } else {
                dpMinCost.add(dpMinCost.get(i-1));
            }

        }
        System.out.println(dpMinCost);
        return dpMinCost.getLast();

    }

}
