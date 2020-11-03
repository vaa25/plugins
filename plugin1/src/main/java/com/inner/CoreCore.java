package com.inner;

import com.Core;
import org.springframework.stereotype.Service;

@Service
public final class CoreCore implements Core {

    @Override
    public String toString(){
        return "Core injected";
    }

}
