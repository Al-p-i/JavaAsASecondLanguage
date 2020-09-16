package io.github.javaasasecondlanguage.lecture01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void getHelloWorld() {
        var hw = new HelloWorld();
        assertEquals("Hello, World!", hw.getHelloWorld());
    }
}