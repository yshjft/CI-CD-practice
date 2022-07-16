package com.deploy.practice;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Response {
  private String version;
  private String message;
  private String detail;

  @Builder
  public Response(String version, String message, String detail) {
    this.version = version;
    this.message = message;
    this.detail = detail;
  }
}
