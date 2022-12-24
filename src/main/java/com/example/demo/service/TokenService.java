package com.example.demo.service;

import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Component
public class TokenService {

    public String getToken() throws RestClientException, IOException
    {
        String baseUrl = "http://localhost:8089/token";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = null;
        try
        {
            response = restTemplate.exchange(baseUrl, HttpMethod.GET, getHeaders(), String.class);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println(response.getBody());
        return response.getBody().toString();
    }

    private static HttpEntity<?> getHeaders() throws IOException
    {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
        return new HttpEntity<>(headers);
    }
}
