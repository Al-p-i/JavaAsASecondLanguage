package io.github.javaasasecondlanguage.lecture01;

public class HelloWorld {
    public String getHelloWorld() {
        Object obj = 42;
        if (obj instanceof Integer a) {
            System.out.println(a);
        }
        return "Hello, World!";
    }
}
