package com.deploy.practice.controller;

import com.deploy.practice.dto.AddResponse;
import com.deploy.practice.dto.PositiveOrNegativeResponse;
import com.deploy.practice.service.NumberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/number")
@RequiredArgsConstructor
public class NumberController {
  private final NumberService numberService;

  @GetMapping("/positive-or-negative")
  public ResponseEntity<PositiveOrNegativeResponse> getNegativeOrPositive(int number) {
    String ans = numberService.getNegativeOrPositive(number);

    return ResponseEntity
        .ok()
        .body(new PositiveOrNegativeResponse(ans));
  }

  @GetMapping("/add")
  public ResponseEntity<AddResponse> addPositiveNumbers(int a, int b) {
    int ans = numberService.addPositiveNumbers(a, b);

    return ResponseEntity
        .ok()
        .body(new AddResponse(ans));
  }
}
