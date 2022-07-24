package com.deploy.practice.dto;

import lombok.Getter;

@Getter
public class AddResponse {
  private int ans;

  public AddResponse(int ans) {
    this.ans = ans;
  }
}
