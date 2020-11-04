package com.inner;

import com.Source;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public final class StubSource implements Source {

    @Value("${stub.prop}")
    private String stubProp;

    @Override
    public String value() {
        return stubProp;
    }
}
