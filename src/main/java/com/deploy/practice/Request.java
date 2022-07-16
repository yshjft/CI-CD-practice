package com.deploy.practice;

import javax.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Getter;

@Getter
public class Request {
  @NotBlank
  private final String title;
  @NotBlank
  private final String message;

  @Builder
  public Request(String title, String message) {
    this.title = title;
    this.message = message;
  }
}
