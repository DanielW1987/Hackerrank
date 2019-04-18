package com.wagner.practice.util;

import org.junit.jupiter.api.Test;

import static org.fest.assertions.Assertions.*;

/**
 * User: DanielW
 * Date: 18.04.2019
 * Time: 16:02
 */
class AlgorithmUtilTest {

  @Test
  void isValueAMultipleOf() {
    assertThat(AlgorithmUtil.isValueAMultipleOf(10, 5)).isTrue();
    assertThat(AlgorithmUtil.isValueAMultipleOf(100, 2)).isTrue();
    assertThat(AlgorithmUtil.isValueAMultipleOf(11, 1)).isTrue();
    assertThat(AlgorithmUtil.isValueAMultipleOf(10, 10)).isTrue();
    assertThat(AlgorithmUtil.isValueAMultipleOf(Long.MAX_VALUE, Long.MAX_VALUE)).isTrue();
    assertThat(AlgorithmUtil.isValueAMultipleOf(Long.MIN_VALUE, Long.MIN_VALUE)).isTrue();

    assertThat(AlgorithmUtil.isValueAMultipleOf(0, 10)).isFalse();
    assertThat(AlgorithmUtil.isValueAMultipleOf(10,0)).isFalse();
    assertThat(AlgorithmUtil.isValueAMultipleOf(10,15)).isFalse();
    assertThat(AlgorithmUtil.isValueAMultipleOf(22,57)).isFalse();
  }

  @Test
  void isEven() {
    assertThat(AlgorithmUtil.isEven(0)).isTrue();
    assertThat(AlgorithmUtil.isEven(2)).isTrue();
    assertThat(AlgorithmUtil.isEven(4)).isTrue();
    assertThat(AlgorithmUtil.isEven(10)).isTrue();
    assertThat(AlgorithmUtil.isEven(-10)).isTrue();
    assertThat(AlgorithmUtil.isEven(-100)).isTrue();
    assertThat(AlgorithmUtil.isEven(Long.MIN_VALUE)).isTrue();

    assertThat(AlgorithmUtil.isEven(-101)).isFalse();
    assertThat(AlgorithmUtil.isEven(1)).isFalse();
    assertThat(AlgorithmUtil.isEven(15)).isFalse();
    assertThat(AlgorithmUtil.isEven(1555555)).isFalse();
    assertThat(AlgorithmUtil.isEven(Long.MAX_VALUE)).isFalse();
  }

  @Test
  void isOdd() {
    assertThat(AlgorithmUtil.isOdd(0)).isFalse();
    assertThat(AlgorithmUtil.isOdd(2)).isFalse();
    assertThat(AlgorithmUtil.isOdd(4)).isFalse();
    assertThat(AlgorithmUtil.isOdd(10)).isFalse();
    assertThat(AlgorithmUtil.isOdd(-10)).isFalse();
    assertThat(AlgorithmUtil.isOdd(-100)).isFalse();
    assertThat(AlgorithmUtil.isOdd(Long.MIN_VALUE)).isFalse();

    assertThat(AlgorithmUtil.isOdd(-101)).isTrue();
    assertThat(AlgorithmUtil.isOdd(1)).isTrue();
    assertThat(AlgorithmUtil.isOdd(15)).isTrue();
    assertThat(AlgorithmUtil.isOdd(1555555)).isTrue();
    assertThat(AlgorithmUtil.isOdd(Long.MAX_VALUE)).isTrue();
  }

  @Test
  void isPrime() {
    assertThat(AlgorithmUtil.isPrime(0)).isFalse();
    assertThat(AlgorithmUtil.isPrime(1)).isFalse();
    assertThat(AlgorithmUtil.isPrime(4)).isFalse();
    assertThat(AlgorithmUtil.isPrime(9)).isFalse();
    assertThat(AlgorithmUtil.isPrime(10)).isFalse();
    assertThat(AlgorithmUtil.isPrime(15)).isFalse();
    assertThat(AlgorithmUtil.isPrime(85)).isFalse();
    assertThat(AlgorithmUtil.isPrime(100)).isFalse();
    assertThat(AlgorithmUtil.isPrime(500000)).isFalse();
    assertThat(AlgorithmUtil.isPrime(60000)).isFalse();
    assertThat(AlgorithmUtil.isPrime(156470)).isFalse();

    assertThat(AlgorithmUtil.isPrime(3)).isTrue();
    assertThat(AlgorithmUtil.isPrime(5)).isTrue();
    assertThat(AlgorithmUtil.isPrime(151)).isTrue();
    assertThat(AlgorithmUtil.isPrime(827)).isTrue();
    assertThat(AlgorithmUtil.isPrime(1987)).isTrue();
    assertThat(AlgorithmUtil.isPrime(2671)).isTrue();
    assertThat(AlgorithmUtil.isPrime(3779)).isTrue();
    assertThat(AlgorithmUtil.isPrime(4463)).isTrue();
    assertThat(AlgorithmUtil.isPrime(4943)).isTrue();
    assertThat(AlgorithmUtil.isPrime(5569)).isTrue();
    assertThat(AlgorithmUtil.isPrime(6311)).isTrue();
    assertThat(AlgorithmUtil.isPrime(6949)).isTrue();
    assertThat(AlgorithmUtil.isPrime(7703)).isTrue();
    assertThat(AlgorithmUtil.isPrime(8087)).isTrue();
    assertThat(AlgorithmUtil.isPrime(9067)).isTrue();
    assertThat(AlgorithmUtil.isPrime(13999)).isTrue();
  }

  @Test
  void getLastDigit() {
    assertThat(AlgorithmUtil.getLastDigit(0)).isEqualTo(0);
    assertThat(AlgorithmUtil.getLastDigit(Long.MAX_VALUE)).isEqualTo(7);
    assertThat(AlgorithmUtil.getLastDigit(Long.MIN_VALUE)).isEqualTo(8);
    assertThat(AlgorithmUtil.getLastDigit(-987)).isEqualTo(7);
    assertThat(AlgorithmUtil.getLastDigit(1)).isEqualTo(1);
    assertThat(AlgorithmUtil.getLastDigit(159)).isEqualTo(9);
  }

  @Test
  void longValueToIntArray() {
    long value = 1534231;
    int[] expectedResult = new int[]{1, 5, 3, 4, 2, 3, 1};

    assertThat(AlgorithmUtil.longValueToIntArray(value)).isEqualTo(expectedResult);
  }

  @Test
  void reverseArray() {
    int[] initialArray  = new int[]{1, 5, 3, 4, 2, 3, 1};
    int[] expectedArray = new int[]{1, 3, 2, 4, 3, 5, 1};

    assertThat(AlgorithmUtil.reverseArray(initialArray)).isEqualTo(expectedArray);
  }

  @Test
  void isPalindromeNumber() {
    assertThat(AlgorithmUtil.isPalindromeNumber(0)).isTrue();
    assertThat(AlgorithmUtil.isPalindromeNumber(1)).isTrue();
    assertThat(AlgorithmUtil.isPalindromeNumber(2)).isTrue();
    assertThat(AlgorithmUtil.isPalindromeNumber(5)).isTrue();
    assertThat(AlgorithmUtil.isPalindromeNumber(6)).isTrue();
    assertThat(AlgorithmUtil.isPalindromeNumber(11)).isTrue();
    assertThat(AlgorithmUtil.isPalindromeNumber(99)).isTrue();
    assertThat(AlgorithmUtil.isPalindromeNumber(7557)).isTrue();

    assertThat(AlgorithmUtil.isPalindromeNumber(12)).isFalse();
    assertThat(AlgorithmUtil.isPalindromeNumber(13)).isFalse();
    assertThat(AlgorithmUtil.isPalindromeNumber(133121)).isFalse();
    assertThat(AlgorithmUtil.isPalindromeNumber(565652)).isFalse();
    assertThat(AlgorithmUtil.isPalindromeNumber(753)).isFalse();
    assertThat(AlgorithmUtil.isPalindromeNumber(6523)).isFalse();
  }
}