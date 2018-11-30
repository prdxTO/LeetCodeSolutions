package org.paradox;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JewelsAndStones {

  public int numJewelsInStonesStream(String jewelStr, String stoneStr) {
    List<String> jewelArray = Arrays.asList(jewelStr.split("(?!^)"));
    List<String> stoneArray = Arrays.asList(stoneStr.split("(?!^)"));

    return stoneArray.stream().filter(jewelArray::contains).collect(Collectors.toList()).size();
  }

  public int numJewelsInStones(String jewelStr, String stoneStr) {
    int count = 0;
    for (char c : stoneStr.toCharArray()) {
      if (jewelStr.indexOf(c) != -1) {
        count++;
      }
    }
    return count;
  }
}
