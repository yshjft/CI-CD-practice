package com.deploy.practice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class TestControllerV1 {
  @GetMapping
  public ResponseEntity<Response> getApiInfo() {
    Response response = Response.builder()
        .version("V1")
        .message("V1 GET test")
        .detail("version 1.0 api 입니다. GET 메서드를 사용하는 API를 테스트합니다. 변경됨?")
        .build();

    return ResponseEntity
        .ok()
        .body(response);
  }

  @PostMapping
  public ResponseEntity<Response> postApiInfo(@RequestBody Request request) {
    Response response = Response.builder()
        .version("V1")
        .message("V1 POST test")
        .detail(String.format("전송된 메시지의 내용은 [%s, %s]입니다. POST 메서드를 사용하는 API를 테스트합니다. 다만 실제로 데이터를 저장하지는 않습니다!", request.getTitle(), request.getMessage()))
        .build();

    return ResponseEntity
        .created(null)
        .body(response);
  }
}
