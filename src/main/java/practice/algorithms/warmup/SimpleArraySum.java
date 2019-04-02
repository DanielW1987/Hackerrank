package practice.algorithms.warmup;

import java.util.stream.IntStream;

public class SimpleArraySum {

  public static void main(String[] args) {
    int[] intArray = new int[]{1, 2, 3, 4, 10, 11};
    int sum = simpleArraySum(intArray);
    System.out.println(sum);
  }

  private static int simpleArraySum(int[] arr) {
    return IntStream.of(arr).sum();
  }
}
