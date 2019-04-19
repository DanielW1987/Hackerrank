package com.wagner.projecteuler.problem_005;

import com.wagner.shared.util.AlgorithmUtil;

/**
 * User: DanielW
 * Date: 07.12.2018
 * Time: 16:11
 */

public class SmallestMultiple {

  /*
   * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
   * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
   */

  public void test_smallest_multiple() {
    long valueToCheck = 2520;
    boolean doWhile   = true;

    while (doWhile) {
      for (int divider = 20; divider > 0; divider--) {
        if (AlgorithmUtil.isValueAMultipleOf(valueToCheck, divider)) {
          if (divider == 1) {
            doWhile = false;
            break;
          }
        }
        else {
          divider = 20;
          valueToCheck+=20;
        }
      }
    }

    // Assertions.assertThat(valueToCheck).isEqualTo(232792560);
  }

}

