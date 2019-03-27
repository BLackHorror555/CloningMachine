package cloningfactory;

import java.awt.*;

public class AlmightyFactory {
    public static Person createRegularPerson() {
        return new Person(20, 180, 80, "Olehan Balalaykin Olegovich", "Negroid",
                Color.BLUE, 50, 10, false);
    }

    public static Dogge createMemDogge() {
        return new Dogge(1, "It is Dogge");
    }
}
