package kr.co.sanghun.example.websamplecode.http.controller;

import kr.co.sanghun.example.websamplecode.http.service.HttpClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/httpclient")
@RequiredArgsConstructor
public class HttpClientController {

    private final HttpClientService httpClientService;

    @RequestMapping("/test")
    public ResponseEntity<?> testWebClient() {
        String reqHttps = httpClientService.reqHttps();
        return new ResponseEntity<>(reqHttps, HttpStatus.OK);
    }
}
