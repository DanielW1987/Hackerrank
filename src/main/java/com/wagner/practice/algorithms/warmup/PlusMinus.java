package com.wagner.practice.algorithms.warmup;

import java.text.DecimalFormat;

public class PlusMinus {

  public static void main(String[] args) {
    int[] intArray = new int[]{-4, 3, -9, 0, 4, 1};
    plusMinus(intArray);
  }

  private static void plusMinus(int[] arr) {
    double positiveOccurence = 0;
    double negativeOccurence = 0;
    double zeroOccurence     = 0;

    for (int number : arr) {
      if (number > 0) {
        positiveOccurence++;
      }
      else if (number < 0) {
        negativeOccurence++;
      }
      else {
        zeroOccurence++;
      }
    }

    DecimalFormat formatter = new DecimalFormat("#0.######");
    System.out.println(formatter.format(positiveOccurence / arr.length));
    System.out.println(formatter.format(negativeOccurence / arr.length));
    System.out.println(formatter.format(zeroOccurence / arr.length));
  }
}
