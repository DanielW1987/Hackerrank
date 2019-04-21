package com.wagner.hackerrank.practice.algorithms.implementation;

public class Kangaroo {

  public static void main(String[] args) {
    System.out.println(kangaroo(0, 3, 4, 2));
  }

  /**
   * The method maps both kangaroos in a linear coordinate system.
   *
   * a = jump rate
   * b = starting point
   *
   * y1 = a1x +b1
   * y2 = a2x + b2
   *
   * a1x + b1   =  a2x + b2
   * (a1 - a2)x =  b2 - b1
   *          x =  (b2 - b1) / (a1-a2)
   *
   * condition: a1 > a2 && b2 > b1
   *
   * @param x1 origin of line 1
   * @param v1 increase rate of line 1
   * @param x2 origin of line 2
   * @param v2 increase rate of line 2
   * @return 'YES' if both lines are intersect, 'NO' otherwise
   */
  static String kangaroo(int x1, int v1, int x2, int v2) {
    // The Kangaroo with the higher jump distance has to start behind the other Kangaroo, otherwise it's not possible
    // that they intersect.
    if (!(v1 > v2 && x2 > x1)) {
      return "NO";
    }

    return (x2 - x1) % (v1 - v2) == 0 ? "YES" : "NO";
  }

}
