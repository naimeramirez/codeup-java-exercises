import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("John");
        people[1] = new Person("Deer");
        people[2] = new Person("Sue");

        Person addedPerson = new Person("Jack");
        Person[] people2 = addPerson(people, addedPerson);

        for (Person person : people) {
            System.out.println(person.getName());
        }

        for (var i = 0; i < people2.length; i++) {
            System.out.println(people2[i].getName());
        }

    }

    public static Person[] addPerson(Person[] people, Person newPerson) {
        Person[] morePeople = Arrays.copyOf(people, people.length + 1);
        morePeople[morePeople.length - 1] = newPerson;
        return morePeople;
    }

}
