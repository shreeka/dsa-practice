package problems;

import java.util.List;

public class JumpGame {
    /*
     ### **Jump Game**

- **Problem**: You are given an array of non-negative integers where each element represents your maximum jump length at that position. Your goal is to determine if you can reach the last index starting from the first index.
- **Input**: List of integers representing the jump lengths at each index.
Input: [2, 3, 1, 1, 4]
Output: True

Input: [3, 2, 1, 0, 4]
Output: False
     */
    public static boolean canJump(List <Integer> jumps) {

        if (jumps.size() == 1) {
            return true;
        }

        int furthestIndex = 0;

        for (int i = 0; i < jumps.size() - 1; i++) {

            if (i > furthestIndex) {
                return false;
            }

            furthestIndex = Math.max(furthestIndex, i + jumps.get(i));

            if (furthestIndex >= jumps.size() -1) {
                return true;
            }
        }
        return false;

    }
}
