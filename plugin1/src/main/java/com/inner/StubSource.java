package com.inner;

import com.Source;
import org.springframework.stereotype.Component;

@Component
public final class StubSource implements Source {

    @Override
    public String value() {
        return "Stub";
    }
}
