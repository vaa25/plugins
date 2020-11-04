package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FirstSource implements Source{
    @Value("${first.api.url:${api.url.default}}")
    private String apiUrl;

    @Override
    public String value() {
        return apiUrl;
    }
}
