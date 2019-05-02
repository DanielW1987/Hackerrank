package com.wagner.shared.util;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * User: DanielW
 * Date: 18.04.2019
 * Time: 15:58
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class AlgorithmUtil {

  private AlgorithmUtil () {
    // util class
  }

  /**
   * Checks if a given long value is a multiple of a given multipleBase.
   * @param valueToCheck long value to check
   * @param multipleBase the basis
   * @return true if the value is a multiple of the given multipleBase, false otherwise
   */
  public static boolean isValueAMultipleOf(long valueToCheck, long multipleBase) {
    if (valueToCheck == 0 || multipleBase == 0) {
      return false;
    }

    return valueToCheck % multipleBase == 0;
  }

  /**
   * // ToDo DanielW: JavaDoc
   * @param seed the seed
   * @param multipleBase the multiple base
   * @return the next multiple of a number starting from a given seed
   */
  public static long nextMultipleOfNumber(long seed, long multipleBase) {
    for (long value = seed;;value++) {
      if (isValueAMultipleOf(value, multipleBase)) {
        return value;
      }
    }
    // ToDo DanielW: Abbruchbedingung
  }

  /**
   * Checks if the given long value is even.
   * @param value long value to check
   * @return true if the value is even, false otherwise
   */
  public static boolean isEven(long value) {
    return value % 2 == 0;
  }

  /**
   * Checks if the given long value is odd.
   * @param value long value to check
   * @return true if the value is odd, false otherwise
   */
  public static boolean isOdd(long value) {
    return ! isEven(value);
  }

  /**
   * Checks if the given long value is a prime number.
   * @param value long value to check
   * @return true if the value is even, false otherwise
   */
  public static boolean isPrime(long value) {
    // a prime number is an uneven number larger than 1
    if (value <= 1 || (value != 2 && isEven(value))) {
      return false;
    }

    // every number larger than 5 with a '5' as last digit is divisible by 5
    if (value > 5 && getLastDigit(value) == 5) {
      return false;
    }

    long maxDivisor = (long) Math.sqrt(value);
    for (int divisor = 3; divisor <= maxDivisor; divisor += 2) {
      if (value % divisor == 0) {
        return false;
      }
    }

    return true;
  }

  /**
   * Returns the last digit of a given long value. The return value is always positive.
   * @param value long value where the last digit has to be extracted
   * @return last digit of a long value
   */
  public static int getLastDigit(long value) {
    return Math.abs((int) (value % 10));
  }

  /**
   * // ToDo DanielW: JavaDoc
   * @param value the value that should be transformed to an array
   * @return the array of the value
   */
  public static int[] longValueToArray(long value) {
    long currentValue         = value;
    Deque<Integer> longValues = new ArrayDeque<>();

    while (currentValue > 0) {
      longValues.addFirst(getLastDigit(currentValue));
      currentValue /= 10;
    }

    return longValues.stream().mapToInt(v -> v).toArray();
  }

  /**
   * Reverses a given array.
   * @param array array that should be reversed
   * @return the reverted array
   */
  public static int[] reverseArray(int[] array) {
    int[] revertedArray = new int[array.length];
    for (int index = 0; index < array.length; index++) {
      revertedArray[index] = array[array.length - 1 - index];
    }

    return revertedArray;
  }

  /**
   * Checks if the given number is a palindrome.
   * Examples for palindrome numbers are:
   * <ul>
   *  <li>99</li>
   *  <li>7557</li>
   *  <li>111111</li>
   * </ul>
   * By definition, every number with only one digit is a palindrome.
   * @param value the long value to check
   * @return true if the long value is a palindrome, false otherwise
   */
  public static boolean isPalindromeNumber(long value) {
    int[] valueAsIntArray       = longValueToArray(value);
    int[] reversedValueIntArray = reverseArray(valueAsIntArray);

    return Arrays.equals(valueAsIntArray, reversedValueIntArray);
  }

  /**
   * Checks whether a given value is between a specified range.
   * @param value the value to check
   * @param limitA the first value of the range (inclusive)
   * @param limitB the second value of the range (inclusive)
   * @return true, if the value is between the specified range, false otherwise
   */
  public static boolean isBetween(long value, long limitA, long limitB) {
    long startValue = Math.min(limitA, limitB);
    long endValue   = Math.max(limitA, limitB);
    return value >= startValue && value <= endValue;
  }

}