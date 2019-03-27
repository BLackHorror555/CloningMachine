package cloningfactory;

import java.awt.*;
import java.util.Objects;

public class Person implements CloningMachine {
    private final int age;
    private final int growth;
    private final int weight;
    private final String name;
    private final String race;
    private final Color bodyColor;
    private final int howManyDumplingsCanEatAtOnce;
    private final int littleFingerLength;
    private final boolean isFool;

    Person(int age, int growth, int weight, String name, String race, Color bodyColor,
           int howManyDumplingsCanEatAtOnce, int littleFingerLength, boolean isFool) {
        this.age = age;
        this.growth = growth;
        this.weight = weight;
        this.name = name;
        this.race = race;
        this.bodyColor = bodyColor;
        this.howManyDumplingsCanEatAtOnce = howManyDumplingsCanEatAtOnce;
        this.littleFingerLength = littleFingerLength;
        this.isFool = isFool;
    }

    Person(Person person) {
        this.age = person.age;
        this.growth = person.growth;
        this.weight = person.weight;
        this.name = person.name;
        this.race = person.race;
        this.bodyColor = person.bodyColor;
        this.howManyDumplingsCanEatAtOnce = person.howManyDumplingsCanEatAtOnce;
        this.littleFingerLength = person.littleFingerLength;
        this.isFool = person.isFool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                growth == person.growth &&
                weight == person.weight &&
                howManyDumplingsCanEatAtOnce == person.howManyDumplingsCanEatAtOnce &&
                littleFingerLength == person.littleFingerLength &&
                isFool == person.isFool &&
                Objects.equals(name, person.name) &&
                Objects.equals(race, person.race) &&
                Objects.equals(bodyColor, person.bodyColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, growth, weight, name, race, bodyColor, howManyDumplingsCanEatAtOnce, littleFingerLength, isFool);
    }

    @Override
    public Object makeClone() {
        return new Person(this);
    }
}
