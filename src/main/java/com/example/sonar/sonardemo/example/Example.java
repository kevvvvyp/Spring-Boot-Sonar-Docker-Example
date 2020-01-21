package com.example.sonar.sonardemo.example;

public class Example {

    private String string;

    public Example() {
        infiniteLoop();
    }

    private void infiniteLoop() {
        while (1 == 1) {
            // Do nothing
        }
    }
}
