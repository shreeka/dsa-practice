package problems;


import java.util.*;

public class SlidingWindow {

    /*
    Sliding Window problems are problems in which a fixed or variable-size window is moved through a data structure, typically an array or string, to solve problems efficiently based on continuous subsets of elements. This technique is used when we need to find subarrays or substrings according to a given set of conditions.
    Watch https://www.youtube.com/watch?v=MK-NZ4hN7rs

     */

    public static int smallestSubArray(int[] arr, int targetSum) {
        int windowStart = 0;
        int minWindowSize = Integer.MAX_VALUE;
        int currentWindowSum = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            currentWindowSum += arr[windowEnd];

            while(currentWindowSum >= targetSum) {
                minWindowSize = Math.min(minWindowSize,windowEnd-windowStart+1);
                //slide the left side of window
                currentWindowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return minWindowSize;
    }

    public static String longestSubStringWithoutRepeat (String s) {
        int winStart = 0;
        int maxLength = 0;
        int maxStartIndex = 0;
        Set<Character> subst = new HashSet<>();
        for (int winEnd = 0; winEnd < s.length(); winEnd ++) {
            char currentChar = s.charAt(winEnd);
           while(subst.contains(currentChar)) {
                subst.remove(s.charAt(winStart));
                winStart++;
            }
            subst.add(currentChar);
           int currentWinSize = winEnd - winStart + 1;
           if (currentWinSize > maxLength) {
               maxLength = currentWinSize;
               maxStartIndex = winStart;
           }

        }
        return s.substring(maxStartIndex,maxStartIndex + maxLength);

    }

}
