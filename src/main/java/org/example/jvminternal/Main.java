package org.example.jvminternal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static int counter = 0;
    static void print() {
        System.out.println("Static method");
    }
    public static void main(String[] args) {
        // Method Area - Class names, Method bytecodes, Static variable, Constant pool, Method and field reference.

        // Heap - All Java Object, managed by Garbage collector.
//        Main main = new Main();
//        main.add(2,4);

        // Java Stack - During Execution, Local variable new method,

        // Program Counters
        int x = 5;
        x++; // then moved the PC to the next instruction.

        // Native method stack - C/C++ code and accessing them with Java Native Interface
//        System.loadLibrary("nativeLib");

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list = list.stream().filter(data -> data%2==0).map(input -> input*input).toList();
        System.out.println(list);

    }

    native void callNative();


    public int add(int a, int b) {
        int sum = a + b; // Local variable,
        return sum;
    }
}
