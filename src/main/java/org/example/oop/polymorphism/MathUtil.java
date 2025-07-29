package org.example.oop.polymorphism;

// Same method with different parameter. - method overloading.
public class MathUtil {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b, double c) {
        return a + b + c;
    }
}
