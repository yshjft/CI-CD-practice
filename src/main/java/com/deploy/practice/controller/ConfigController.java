package com.deploy.practice.controller;

import com.deploy.practice.config.AConfig;
import com.deploy.practice.config.BConfig;
import com.deploy.practice.dto.ConfigResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/configs")
@RequiredArgsConstructor
public class ConfigController {
  private final AConfig aConfig;
  private final BConfig bConfig;

  @GetMapping("/a")
  public ResponseEntity<ConfigResponse> getConfigA() {
    return ResponseEntity
        .ok()
        .body(new ConfigResponse(aConfig.getCode(), aConfig.getMessage()));
  }

  @GetMapping("/b")
  public ResponseEntity<ConfigResponse> getConfigB() {
    return ResponseEntity
        .ok()
        .body(new ConfigResponse(bConfig.getCode(), bConfig.getMessage()));
  }
}
