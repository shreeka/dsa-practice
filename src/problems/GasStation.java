package problems;

import java.util.List;

public class GasStation {
    /*
     *### **Gas Station Problem**

- **Problem**: There are `n` gas stations along a circular route. Each station has some amount of gas, and you have a car with a fuel tank that starts empty. You can travel between stations, and your car uses one unit of gas per unit distance. You need to determine whether it's possible to complete the circuit, and if so, where to start.
* Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return -1. If there exists a solution, it is guaranteed to be unique.
* Input: gas = [1, 2, 3, 4, 5], cost = [3, 4, 5, 1, 2]
* Greedy approach: greedy jump to next station to check if it can give us enough gas to be able to go to the next station -> to get starting index
*
* Time complexity O(n) where n is no of gas stations
* Since no data structure grows with the size of the input (no additional arrays or lists are created, and no recursion is used), the space complexity is O(1), or constant space
     */

    public static int circularRoutePossible (List <Integer> gas, List <Integer> cost) {

        int currentGasInTank = 0; //to track starting index
        int startingIndex = 0;
        int totalGasNeeded = 0;

        for (int i = 0; i < gas.size(); i++) {
            totalGasNeeded += gas.get(i) - cost.get(i);
            currentGasInTank += gas.get(i);
            //check if I have enough gas to make a trip to next station
            if(currentGasInTank < cost.get(i)) {
                startingIndex ++;
                currentGasInTank = 0; // Start over from next station
            }else {
                currentGasInTank -= cost.get(i);
            }
        }
        //Check if gas is left in tank after making the circular route
        if (totalGasNeeded >= 0) {
            return startingIndex;
        }else {
            return -1;
        }

    }


}
