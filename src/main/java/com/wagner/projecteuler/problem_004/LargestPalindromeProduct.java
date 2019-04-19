package com.wagner.projecteuler.problem_004;

import com.wagner.shared.util.AlgorithmUtil;

/**
 * User: DanielW
 * Date: 07.12.2018
 * Time: 15:00
 */
public class LargestPalindromeProduct {

  /*
   * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
   * Find the largest palindrome made from the product of two 3-digit numbers.
   */

  public void test_find_largest_palindrome_product() {
    long result = -1;
    int factor1Max = -1;
    int factor2Max = -1;
    for (int factor1 = 999; factor1 > 0; factor1--) {
      for (int factor2 = 999; factor2 > 0; factor2--) {
        long product = factor1 * factor2;
        if (AlgorithmUtil.isPalindromeNumber(product) && product > result) {
          result = product;
          factor1Max = factor1;
          factor2Max = factor2;
        }
      }
    }

    System.out.println(result);
    System.out.println(factor1Max);
    System.out.println(factor2Max);
  }
}

