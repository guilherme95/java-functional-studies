package streams;

import java.util.List;
import java.util.stream.Collectors;

import static streams._Stream.Gender.*;

public class _Stream {
    public static void main(String[] args) {
        List<Person> peoples = List.of(
                new Person("Adilson", MALE),
                new Person("Georgia", FEMALE),
                new Person("Bolota", MALE),
                new Person("Lupita", FEMALE)
        );

        System.out.println("--- name lengths ---");
        peoples.stream()
                .map(person->person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        System.out.println("--- genders to set ---");
        peoples.stream()
                .map(person->person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);


        boolean femaleAnyMatch = peoples.stream().anyMatch(person->FEMALE.equals(person.gender));
        System.out.println("femaleAnyMatch: " + femaleAnyMatch);

    }

    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
