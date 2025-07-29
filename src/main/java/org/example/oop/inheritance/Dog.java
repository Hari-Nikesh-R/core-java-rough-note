package org.example.oop.inheritance;

// is-a relationship
public class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking");
    }

    void sleep() {
        super.sleep();
        System.out.println(name + " is sleeping on a couch");
    }
}
