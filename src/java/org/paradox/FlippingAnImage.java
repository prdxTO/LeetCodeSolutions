package org.paradox;

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {

        int[][] result = A;

        for (int[] row: result)
            for (int i = 0; i < (result[0].length + 1) / 2; ++i) {
                int tmp = row[i] ^ 1;
                row[i] = row[result[0].length - 1 - i] ^ 1;
                row[result[0].length - 1 - i] = tmp;
            }

        return result;
    }
}
