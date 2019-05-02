package com.wagner.hackerrank.practice.algorithms.misc;

import com.wagner.shared.util.AlgorithmUtil;

/**
 * User: DanielW
 * Date: 08.04.2019
 * Time: 10:17
 */
public class NumberReversion {

  public static long reverse(long value) {
    // return value directly if it has only one digit
    if (value > -10 && value < 10) {
      return value;
    }

    long baseValue = Math.abs(value);
    long reversedValue = 0;

    while (baseValue > 0) {
      int remainder = AlgorithmUtil.getLastDigit(baseValue);
      reversedValue = reversedValue * 10 + remainder;
      baseValue /= 10;
    }

    return value > 0 ? reversedValue : reversedValue * -1;
  }

}