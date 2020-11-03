package com.inner;

import com.Source;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public final class Printer {

    private final List<Source> sources;

    public Printer(final List<Source> sources) {
        this.sources = sources;
    }

    @PostConstruct
    public void print(){
        sources.stream().map(Source::value).forEach(System.out::println);
    }
}
