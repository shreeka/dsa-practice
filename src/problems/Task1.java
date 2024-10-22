package problems;

import java.util.List;

public class Task1 {

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        if(d == 0) {
            return arr;
        }
        int arrlen = arr.size();
        int effSteps = d % arrlen;
        if(effSteps == 0) {
            return arr;
        }

        reverseArr(arr, 0, effSteps - 1);

        reverseArr(arr, effSteps, arrlen-1);

        reverseArr(arr, 0, arrlen-1);

        return arr;


    }

    private static void reverseArr(List<Integer> arr, int start, int end) {
        while(start < end) {
            int tempVar = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, tempVar);
            start ++;
            end --;
        }

    }

}
