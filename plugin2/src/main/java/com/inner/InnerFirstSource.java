package com.inner;

import com.Source;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class InnerFirstSource implements Source {

    @Value("${api.url:}")
    private String apiUrl;

    @Override
    public String value() {
        return apiUrl;
    }
}
