package com.wagner.projecteuler.problem_002;

import org.junit.jupiter.api.Test;

import static org.fest.assertions.Assertions.*;

class EvenFibonacciNumbersTest {

  @Test
  void sumEvenFibonaccis() {
    long result = EvenFibonacciNumbers.sumEvenFibonaccis(4_000_000);
    assertThat(result).isEqualTo(4_613_732);
  }
}