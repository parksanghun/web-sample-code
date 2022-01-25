package kr.co.sanghun.example.websamplecode.http.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@RequiredArgsConstructor
@Service
public class HttpClientService {

    private final WebClient webClient;
    private final WebClient sslWebClient;

    public String webClient() {
        return webClient
                .get()
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

    public String sslWebClient() {
        return sslWebClient
                .get()
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
