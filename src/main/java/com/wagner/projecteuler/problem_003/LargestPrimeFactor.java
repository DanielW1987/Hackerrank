package com.wagner.projecteuler.problem_003;

import com.wagner.shared.util.AlgorithmUtil;

public class LargestPrimeFactor {
  /*
   * The prime factors of 13195 are 5, 7, 13 and 29.
   * What is the largest prime factor of the number 600851475143?
   */

  public void test_largest_prime_factor() {
    long baseValue = 600_851_475_143L;
    long divisor   = (long) Math.sqrt(baseValue);

    // divisor should not be even
    if (AlgorithmUtil.isEven(divisor)) {
      divisor--;
    }

    for(; divisor > 0; divisor -= 2){
      if(   baseValue % divisor == 0
         && AlgorithmUtil.isPrime(divisor)){
        break;
      }
    }

    // Assertions.assertThat(divisor).isEqualTo(6857);
  }

}