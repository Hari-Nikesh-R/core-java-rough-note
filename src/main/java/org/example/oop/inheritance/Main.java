package org.example.oop.inheritance;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.name = "Kutty";
        cat.name = "Subramani";

        dog.eat();
        dog.sleep();

        cat.sleep();
        cat.meow();
    }
}
