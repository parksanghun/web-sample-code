package kr.co.sanghun.example.websamplecode.http.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class HttpClientService {

    private final WebClient webClient;

    public HttpClientService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://jsonplaceholder.typicode.com").build();
    }

    public String reqHttps() {
        return webClient
                .get()
                .uri("/comments")
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
