package org.paradox;

public class ToLowerCase {
    public String toLowerCase(String str) {
        StringBuilder newStr = new StringBuilder(str);

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c >= 65 && c <= 90) {
                newStr.setCharAt(i, (char) (c + 32));
            }
        }

        return newStr.toString();
    }
}
