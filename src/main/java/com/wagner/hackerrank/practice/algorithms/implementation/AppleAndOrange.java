package com.wagner.hackerrank.practice.algorithms.implementation;

import com.wagner.shared.util.AlgorithmUtil;

import java.util.Arrays;

public class AppleAndOrange {

  /*
   * s: integer, starting point of Sam's house location.
   * t: integer, ending location of Sam's house location.
   * a: integer, location of the Apple tree.
   * b: integer, location of the Orange tree.
   * apples: integer array, distances at which each apple falls from the tree.
   * oranges: integer array, distances at which each orange falls from the tree.
   */

  public static void main(String[] args) {
    countApplesAndOranges(7,11, 5, 15, new int[]{-2, 2, 1}, new int[]{5, -6});
  }

  static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
    System.out.println(calculateHits(s, t, a, apples));
    System.out.println(calculateHits(s, t, b, oranges));
  }

  private static long calculateHits(int startingPoint, int endingPoint, int treeLocation, int[] fruitDistance) {
    return Arrays.stream(fruitDistance)
                 .filter(distance -> AlgorithmUtil.isBetween(distance + treeLocation, startingPoint, endingPoint))
                 .count();
  }
}
