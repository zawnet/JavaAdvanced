package opp.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person janKowalski = new Person("Jan Kowalski", 40);
        Person ewaNowak = new Person("Ewa Nowak", 28);
        Person januszPanasewicz = new Person("Janusz Panasiewicz", 68);

        List<Person> persons = new ArrayList<>();
        persons.add(janKowalski);
        persons.add(ewaNowak);
        persons.add(januszPanasewicz);

        Collections.sort(persons, new AgeComparator());

        System.out.println(persons);

        Collections.sort(persons, new ReverseComparator<Person>(new AgeComparator()));

        System.out.println(persons);
    }
}
