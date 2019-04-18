package com.wagner.practice.algorithms.warmup;

import java.util.Arrays;
import java.util.List;

public class CompareTriplets {

  public static void main(String[] args) {
    List<Integer> a = Arrays.asList(17, 28, 30);
    List<Integer> b = Arrays.asList(99, 16, 8);

    List<Integer> result = compareTriplets(a, b);
    System.out.println(result);
  }

  private static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    if (a.size() != b.size()) {
      throw new IllegalArgumentException("snh: size of 'a' is different than size of 'b'");
    }

    int pointsOfA = 0;
    int pointsOfB = 0;
    for (int index = 0; index < a.size(); index++) {
      if (a.get(index) > b.get(index)) {
        pointsOfA++;
      }
      else if (a.get(index) < b.get(index)) {
        pointsOfB++;
      }
    }

    return Arrays.asList(pointsOfA, pointsOfB);
  }
}
