package com.wagner.projecteuler.problem_001;

import com.wagner.shared.util.AlgorithmUtil;
import java.util.stream.LongStream;

class MultiplesOf3And5 {

  /*
   * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
   * Find the sum of all the multiples of 3 or 5 below 1000.
   */

  static long sumMultiplesOf3And5(long startInclusive, long endExclusive) {
    return LongStream.range(startInclusive, endExclusive)
                     .filter(valueToCheck ->     AlgorithmUtil.isValueAMultipleOf(valueToCheck, 3)
                                              || AlgorithmUtil.isValueAMultipleOf(valueToCheck, 5))
                     .sum();
  }

}