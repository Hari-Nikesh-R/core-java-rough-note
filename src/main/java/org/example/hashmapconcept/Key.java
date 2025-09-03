package org.example.hashmapconcept;

public class Key {
    String name;
    Key(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return 1; // BAD idea, for Demo
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Key) {
            return this.name.equals(((Key) obj).name);
        }
        return false;
    }

    @Override
    public String toString() {
        return name;
    }
}
