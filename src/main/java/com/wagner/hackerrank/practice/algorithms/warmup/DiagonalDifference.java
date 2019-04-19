package com.wagner.hackerrank.practice.algorithms.warmup;

public class DiagonalDifference {

  public static void main(String[] args) {
    int[][] intArray = new int[][]{{11, 2, 4}, {4, 5, 6}, {10, 8, -12}};
    int result = diagonalDifference(intArray);
    System.out.println(result);
  }

  private static int diagonalDifference(int[][] arr) {
    int primaryDiagonalSum   = 0;
    int secondaryDiagonalSum = 0;

    for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
      primaryDiagonalSum   += arr[i][i];
      secondaryDiagonalSum += arr[i][j];
    }

    return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
  }
}
