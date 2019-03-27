package cloningfactory;

import java.util.Objects;

public class Dogge implements CloningMachine{
    private final int age;
    private final String anotherField;

    public Dogge(int age, String anotherField) {
        this.age = age;
        this.anotherField = anotherField;
    }

    public Dogge(Dogge dogge) {
        this.age = dogge.age;
        this.anotherField = dogge.anotherField;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dogge dogge = (Dogge) o;
        return age == dogge.age &&
                Objects.equals(anotherField, dogge.anotherField);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, anotherField);
    }

    @Override
    public Object makeClone() {
        return new Dogge(this);
    }
}
