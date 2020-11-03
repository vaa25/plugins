package com.inner;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = StartApp.class)
//@ComponentScan
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration
class CoreInjectorTest {

    @Autowired
    private CoreInjector coreInjector;

    @Test
    void test1() {
        assertEquals("Core injected", coreInjector.toString());
    }
}
