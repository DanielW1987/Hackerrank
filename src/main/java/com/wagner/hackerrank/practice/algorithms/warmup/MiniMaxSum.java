package com.wagner.hackerrank.practice.algorithms.warmup;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MiniMaxSum {

  public static void main(String[] args) {
    // int[] numbers = new int[]{12,78,64,14,1,34};
    int[] numbers = new int[]{140537896, 243908675, 670291834, 923018467, 520718469};
    miniMaxSum(numbers);
  }

  private static void miniMaxSum(int[] arr) {
    if (arr.length == 1) {
      System.out.println(arr[0] + " " + arr[0]);
    }
    else if (arr.length > 0) {
      Arrays.sort(arr);
      long sum = IntStream.of(arr).mapToLong(v -> v).sum();

      System.out.print( (sum - arr[arr.length-1]) + " " + (sum - arr[0]) );
    }
  }

}