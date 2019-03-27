import cloningfactory.Dogge;
import cloningfactory.Person;
import cloningfactory.AlmightyFactory;

public class User {
    public static void main(String[] args) {
        Person person = AlmightyFactory.createRegularPerson();
        Person clonedPerson = (Person) person.makeClone();
        System.out.println(person.equals(clonedPerson));

        Dogge dogge = AlmightyFactory.createMemDogge();
        Dogge clonedDogge = (Dogge) dogge.makeClone();
        System.out.println(dogge.equals(clonedDogge));
    }
}
