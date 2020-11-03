package com.inner;

import com.Source;
import org.springframework.stereotype.Component;

@Component
public class InnerFirstSource implements Source {

    @Override
    public String value() {
        return "Inner First source";
    }
}
