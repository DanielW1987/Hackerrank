package com.wagner.hackerrank.practice.algorithms.implementation;

import com.wagner.shared.util.AlgorithmUtil;

import java.util.stream.IntStream;

public class AppleAndOrange {

  public static void main(String[] args) {
    countApplesAndOranges(7,11, 5, 15, new int[]{-2, 2, 1}, new int[]{5, -6});
  }

  /*
   * s: integer, starting point of Sam's house location.
   * t: integer, ending location of Sam's house location.
   * a: integer, location of the Apple tree.
   * b: integer, location of the Orange tree.
   * apples: integer array, distances at which each apple falls from the tree.
   * oranges: integer array, distances at which each orange falls from the tree.
   */

  static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
    int[] appleLocations  = calculateFruitLocations(a, apples);
    int[] orangeLocations = calculateFruitLocations(b, oranges);

    System.out.println(calculateHits(s, t, appleLocations).length);
    System.out.println(calculateHits(s, t, orangeLocations).length);
  }

  private static int[] calculateFruitLocations(int treeLocation, int[] fruitDistances) {
    int[] result = new int[fruitDistances.length];
    for (int index = 0; index < fruitDistances.length; index++) {
      result[index] = treeLocation + fruitDistances[index];
    }

    return result;
  }

  private static int[] calculateHits(int startingPoint, int endingPoint, int[] fruitLocations) {
    return IntStream.of(fruitLocations)
            .filter(v -> AlgorithmUtil.isBetween(v, startingPoint, endingPoint))
            .toArray();
  }

}
