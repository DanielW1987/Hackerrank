package com.wagner.practice.algorithms.warmup;

public class Staircase {

  public static void main(String[] args) {
    staircase(6);
  }

  static void staircase(int n) {
    for (int i = 1; i <= n; i++) {
      int amountOfWhitespaces = n - i;
      for (int j = 0; j < amountOfWhitespaces; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < i; k++) {
        System.out.print("#");
      }
      System.out.println();
    }
  }

}