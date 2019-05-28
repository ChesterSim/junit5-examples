package com.howtoprogram.junit5;

public final class StringUtils {

  public static Integer convertToInt(String str) {
    if (str == null || str.trim().length() == 0) {
      throw new IllegalArgumentException("String must be not null or empty");
    }
    System.out.println("HELLO");
    String[] a = "HELLO".split("");
    
    return null;
  }
}

