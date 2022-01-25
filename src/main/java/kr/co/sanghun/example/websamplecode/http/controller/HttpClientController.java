package kr.co.sanghun.example.websamplecode.http.controller;

import kr.co.sanghun.example.websamplecode.http.service.HttpClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webclient")
@RequiredArgsConstructor
public class HttpClientController {

    private final HttpClientService httpClientService;

    @RequestMapping
    public ResponseEntity<?> testWebClient() {
        String response = httpClientService.webClient();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @RequestMapping("/ssl")
    public ResponseEntity<?> testSslWebClient() {
        String response = httpClientService.sslWebClient();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
