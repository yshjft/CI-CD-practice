package com.deploy.practice.dto;

import lombok.Getter;

@Getter
public class ConfigResponse {
  private String code;
  private String message;

  public ConfigResponse(String code, String message) {
    this.code = code;
    this.message = message;
  }
}
