package org.paradox;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int highestWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > highestWealth) {
                highestWealth = sum;
            }
        }
        return highestWealth;
    }
}
