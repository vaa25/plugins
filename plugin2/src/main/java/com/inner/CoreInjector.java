package com.inner;

import com.Core;
import org.springframework.stereotype.Service;

@Service
public final class CoreInjector {

    private final Core core;

    public CoreInjector(final Core core) {
        this.core = core;
    }

    public String toString(){
        return core.toString();
    }

//    @PostConstruct
    public void test(){
        System.out.println(toString());
    }
}
