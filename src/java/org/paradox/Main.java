package org.paradox;

public class Main {

  public static void main(String[] args) {
    System.out.println("P[771]: Jewels and Stones: " + new JewelsAndStones().numJewelsInStones("aA", "aAAbbbb"));
    System.out.println("P[771]: Jewels and Stones: " + new JewelsAndStones().numJewelsInStonesStream("aA", "aAAbbbb"));
  }
}
