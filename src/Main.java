import problems.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
       // runMinimumCost();
    }

    private static void callTask1() {
        ArrayList<Integer> arr= new ArrayList<Integer>(5);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        int rotation = 2;
        System.out.println("Original Array: "+ arr+ "\n");
        System.out.println("No of Rotation: "+ rotation+ "\n");
        System.out.println("rotateLeft: "+ Task1.rotateLeft(rotation,arr));
    }

    private static void runIceCreamShopChangeProblem() {
        List <Integer> bills = Arrays.asList(5,5,10,15);
        System.out.println(IceCreamShopChange.checkCanGiveChange(bills));

    }

    private static void runCoinChangeProblem() {
        List <Integer> coins = Arrays.asList(1,2);
        System.out.println(CoinChange.minimumCoinsToAmount(coins,3));
    }

    private static void runGasStationProblem() {
        List <Integer> gas = Arrays.asList(1,2,3,4,5);
        List <Integer> cost = Arrays.asList(3,4,5,1,2);
        System.out.println(GasStation.circularRoutePossible(gas,cost));
    }

    private static void runValidParenthesis() {
        System.out.println(ValidParenthesis.isValid(")]}"));
    }

    private static void runCandyDistribution(){
        List <Integer> ratings = Arrays.asList(1,2,2);
        System.out.println(CandyDistribution.minimumCandies(ratings));
    }

    private static void runJumpGame() {
        List <Integer> jumps = Arrays.asList(3, 2, 1, 0, 4);
        System.out.println(JumpGame.canJump(jumps));
    }

    private static void runStringCreationAB() {
        System.out.println(StringCreationAB.solution(4,5));
    }

    private static void runLargestNum() {
        List <Integer> nums = Arrays.asList(3,3, 2, 1, 5, 6, 4,9,8,8,8,3,2,1);
        System.out.println(KLargestNum.findKthElement(nums , 3));
    }

    private static void runSmallestSubArray() {
        int [] arr = new int[]{4,2,2,7,8,1,2,8,1,0};
        System.out.println(SlidingWindow.smallestSubArray(arr,12));
    }

    private static void runLongestSubStringWithoutRepeat() {
        System.out.println(SlidingWindow.longestSubStringWithoutRepeat("abcabcdbb"));
    }

    private static void runMinimumCost() {
        List <Integer> days = Arrays.asList(1, 4, 6, 7, 8, 20);
        List <Integer> price = Arrays.asList(2,7,15);
        System.out.println(BusTickets.minimumCost(days,price));
    }


}

