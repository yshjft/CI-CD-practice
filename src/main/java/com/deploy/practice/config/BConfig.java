package com.deploy.practice.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
public class BConfig {
  @Value("${b.code}")
  private String code;

  @Value("${b.message}")
  private String message;
}
