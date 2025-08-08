package org.example.exception;

import org.example.Animal;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
       // Exception propagation
        Animal animal = new Animal();
        try {
            level1();
            System.gc();
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
        Animal animal = new Animal();

    }



}
