package org.example.sealedclass;

public abstract sealed class Shape permits Circle, Rectangle, Square, Triangle {
    public abstract double area();
}
