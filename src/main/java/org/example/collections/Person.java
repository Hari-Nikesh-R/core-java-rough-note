package org.example.collections;

import java.time.LocalDateTime;
import java.time.Period;

public record Person(String firstName, LocalDateTime dateOfBirth) {
    public int getAge() {
        Period period = Period.between(dateOfBirth.toLocalDate(), LocalDateTime.now().toLocalDate());
        return period.getYears();
    }
}

