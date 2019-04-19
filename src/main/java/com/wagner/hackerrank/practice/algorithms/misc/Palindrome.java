package com.wagner.hackerrank.practice.algorithms.misc;

public class Palindrome {

  public static boolean check(String value) {
    if (value == null || value.isEmpty()) {
      return false;
    }

    String valueToCheck = value.trim().toLowerCase();

    for (int i = 0, j = valueToCheck.length() - 1; i < j; i++, j--) {
      if (valueToCheck.charAt(i) != valueToCheck.charAt(j)) {
        return false;
      }
    }

    return true;
  }

}

