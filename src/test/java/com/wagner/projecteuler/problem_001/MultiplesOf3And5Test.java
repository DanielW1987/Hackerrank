package com.wagner.projecteuler.problem_001;

import org.junit.jupiter.api.Test;

import static org.fest.assertions.Assertions.*;

class MultiplesOf3And5Test {

  @Test
  void test_sumMultiplesOf3And5() {
    long result = MultiplesOf3And5.sumMultiplesOf3And5(1, 1000);
    assertThat(result).isEqualTo(233_168);
  }

}