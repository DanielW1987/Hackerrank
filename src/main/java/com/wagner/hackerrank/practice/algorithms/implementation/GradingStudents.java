package com.wagner.hackerrank.practice.algorithms.implementation;

import com.wagner.shared.util.AlgorithmUtil;

import java.util.Arrays;

/**
 * User: DanielW
 * Date: 18.04.2019
 * Time: 15:54
 */
public class GradingStudents {

  public static void main(String[] args) {
    int[] grades = new int[]{73, 67, 38, 33};
    int[] result = gradingStudents(grades);

    System.out.println(Arrays.toString(result));
  }

  static int[] gradingStudents(int[] grades) {
    int[] result = new int[grades.length];
    for(int index = 0; index < grades.length; index++) {
      result[index] = roundGrade(grades[index]);
    }

    return result;
  }

  static int roundGrade(int grade) {
    // no rounding if grade is less than 38
    if (grade < 38) {
      return grade;
    }

    int nextMultipleOfFive = (int) AlgorithmUtil.nextMultipleOfNumber(grade, 5L);

    if ((nextMultipleOfFive - grade) < 3) {
      return nextMultipleOfFive;
    }
    else {
      return grade;
    }
  }

}