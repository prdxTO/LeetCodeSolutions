package org.paradox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given the array candies and the integer extraCandies, where candies[i] represents the number of candies that the ith kid has.

For each kid check if there is a way to distribute extraCandies among the kids such that he or she can have the greatest
number of candies among them. Notice that multiple kids can have the greatest number of candies.

 */
public class KidsWithGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int largestCandy = -1;
        for (int i = 0; i < candies.length; i++) {
            int kidsCandies = candies[i];
            if (kidsCandies > largestCandy) {
                largestCandy = Math.max(candies[i], largestCandy);
            }
        }

        for (int i = 0; i < candies.length; i++) {
            result.add((candies[i] + extraCandies) >= largestCandy);
        }

        return result;
    }
}
