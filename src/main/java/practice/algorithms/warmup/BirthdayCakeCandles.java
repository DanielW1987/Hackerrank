package practice.algorithms.warmup;

import java.util.Arrays;

/**
 * User: DanielW
 * Date: 28.03.2019
 * Time: 17:45
 * <p>
 * Copyright LucaNet AG
 * <p>
 */

public class BirthdayCakeCandles {

  public static void main(String[] args) {
    int[] numbers = new int[]{3, 2, 3, 1, 3};
    System.out.println(birthdayCakeCandles(numbers));
  }

  private static int birthdayCakeCandles(int[] ar) {
    Arrays.sort(ar);

    int amountOfTallestCandles = 1;
    int tallestCandle = ar[ar.length - 1];

    for (int index = ar.length - 2; index >=0; index--) {
      if (tallestCandle == ar[index]) {
        amountOfTallestCandles++;
      }
      else {
        break;
      }
    }

    return amountOfTallestCandles;
  }

}