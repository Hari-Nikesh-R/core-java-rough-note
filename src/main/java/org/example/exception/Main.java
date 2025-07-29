package org.example.exception;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
       // Exception propagation
        try {
            level1();
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    static void level1() {
        level2();
    }

    static void level2() {
        level3();
    }

    static void level3() {
        throw new RuntimeException("Error at level 3");
    }
}
