package com.deploy.practice.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "a")
@Getter
@Setter
public class AConfig {
  private String code;
  private String message;
}
