package org.paradox;

import java.util.HashMap;

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        for (int i : nums) {
            if (map.containsKey(i)) {
                int occurrences = map.get(i);
                answer += occurrences;
                map.put(i, occurrences + 1);
            } else {
                map.put(i, 1);
            }
        }
        return answer;
    }
}
