package com.deploy.practice.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class NumberServiceTest {
  @InjectMocks
  private NumberService numberService;

  @Nested
  @DisplayName("getNegativeOrPositive() 테스트")
  class TestGetNegativeOrPositive {
    @Test
    @DisplayName("양수 테스트")
    void getPositive() {
      String ans = numberService.getNegativeOrPositive(10);
      assertThat(ans).isEqualTo("positive");
    }

    @Test
    @DisplayName("음수 테스트")
    void getNegative() {
      String ans = numberService.getNegativeOrPositive(-1);
      assertThat(ans).isEqualTo("negative");
    }

    @Test
    @DisplayName("0 테스트")
    void getZero() {
      String ans = numberService.getNegativeOrPositive(0);
      assertThat(ans).isEqualTo("zero");
    }
  }

  @Nested
  @DisplayName("addPositiveNumbers() 테스트")
  class TestAddPositiveNumbers {
    @Test
    @DisplayName("a가 음수인 경우")
    void negativeA() {
      assertThrows(IllegalArgumentException.class, () -> numberService.addPositiveNumbers(-1, 10));
    }

    @Test
    @DisplayName("b가 음수인 경우")
    void negativeB() {
      assertThrows(IllegalArgumentException.class, () -> numberService.addPositiveNumbers(10, -10));
    }

    @Test
    @DisplayName("a와 b 모두 양수")
    void positiveAPositiveB() {
      int result = numberService.addPositiveNumbers(10, 10);
      assertThat(result).isEqualTo(20);
    }
  }
}