package problems;

import java.util.*;

public class KLargestNum {

    public static int findKthElement(List<Integer> nums, int k) {
        List<Integer> elem = new ArrayList<>();

        for(int i: nums) {
            if (!elem.contains(i)) {
                elem.add(i);
            }
        }
        Collections.sort(elem);


        return elem.get(elem.size() - k);

    }


}

