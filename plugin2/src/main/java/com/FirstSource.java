package com;

import org.springframework.stereotype.Component;

@Component
public class FirstSource implements Source{

    @Override
    public String value() {
        return "First source";
    }
}
