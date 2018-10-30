package com.acme.sample;

import java.io.InputStream;

public class Launcher {
    public static void main(String[] args) {
        InputStream in = Launcher.class.getResourceAsStream("text.txt");
        if (in == null) {
            throw new IllegalStateException("Resource not found!");
        } else {
            System.out.println("Hello World");
        }
    }
}