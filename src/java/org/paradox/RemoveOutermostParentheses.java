package org.paradox;

public class RemoveOutermostParentheses {
    public String removeOuterParentheses(String S) {
        int leftParenthesesCount = 0;
        int rightParenthesesCount = 0;
        Integer outerLeftParenthesesIndex = null;
        Integer outerRightParenthesesIndex = null;

        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (c == '(') {
                leftParenthesesCount++;
                if (outerLeftParenthesesIndex == null) {
                    outerLeftParenthesesIndex = i;
                }
            } else if (c == ')') {
                rightParenthesesCount++;
                if (rightParenthesesCount == leftParenthesesCount) {
                    outerRightParenthesesIndex = i;
                }
            }

            if (outerRightParenthesesIndex != null) {
                newStr.append(S, outerLeftParenthesesIndex + 1, outerRightParenthesesIndex); // kind of nasty
                outerLeftParenthesesIndex = null;
                outerRightParenthesesIndex = null;
            }
        }

        return newStr.toString();
    }
}
