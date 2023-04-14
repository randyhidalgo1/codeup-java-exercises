package ArraysExercises;

public class ArraysExercises {
public static Person [] addPerson(Person [] people, Person person) {
    Person [] newPeople = new Person[people.length + 1];
    System.arraycopy(people, 0, newPeople, 0, people.length);
    newPeople[newPeople.length - 1] = person;
    return newPeople;
}
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("John");
        people[1] = new Person("Ruben");
        people[2] = new Person("Neale");

        for (Person person : people) {
            System.out.println(person.getName());
        }
        Person person = new Person("Sally");
        Person [] newPeople = addPerson(people, person);
        for (Person newPerson : newPeople) {
            System.out.println(newPerson.getName());
        }

    }
}
