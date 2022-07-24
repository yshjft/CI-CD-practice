package com.deploy.practice.service;

import org.springframework.stereotype.Service;

@Service
public class NumberService {
  public String getNegativeOrPositive(int number) {
    if(number > 0) {
      return "positive";
    }else if(number < 0) {
      return "negative";
    }else{
      return "zero";
    }
  }

  public int addPositiveNumbers(int a, int b) {
    if(a <= 0) {
      throw new IllegalArgumentException();
    }

    if(b <= 0) {
      throw new IllegalArgumentException();
    }

    return a + b;
  }
}
