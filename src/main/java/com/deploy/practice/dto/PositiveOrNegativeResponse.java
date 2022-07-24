package com.deploy.practice.dto;

import lombok.Getter;

@Getter
public class PositiveOrNegativeResponse {
  private String answer;

  public PositiveOrNegativeResponse(String answer) {
    this.answer = answer;
  }
}
