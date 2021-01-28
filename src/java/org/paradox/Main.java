package org.paradox;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("P[771]: Jewels and Stones: " + new JewelsAndStones().numJewelsInStones("aA", "aAAbbbb"));
        System.out.println("P[771]: Jewels and Stones: " + new JewelsAndStones().numJewelsInStonesStream("aA", "aAAbbbb"));

        System.out.println("P[709]: To Lower Case: " + new ToLowerCase().toLowerCase("Hello"));
        System.out.println("P[709]: To Lower Case: " + new ToLowerCase().toLowerCase("LOVELY"));

        System.out.println("P[1021]: Remove Outercase Parentheses: " + new RemoveOutermostParentheses().removeOuterParentheses("(()())(())"));
        System.out.println("P[1021]: Remove Outercase Parentheses: " + new RemoveOutermostParentheses().removeOuterParentheses("(()())(())(()(()))"));
        System.out.println("P[1021]: Remove Outercase Parentheses: " + new RemoveOutermostParentheses().removeOuterParentheses("()()"));

        System.out.println("P[1480]: Running Sums: " + Arrays.toString(new RunningSums().runningSum(new int[]{1, 2, 3, 4})));

        System.out.println("P[1431]: Kids With the Greatest Number of Candies: " + new KidsWithGreatestNumberOfCandies().kidsWithCandies(new int[]{2,3,5,1,3}, 3));

    }
}
