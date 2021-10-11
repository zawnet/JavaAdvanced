package opp.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.min;

public class GenericMethodInAction {

    public static void main(String[] args) {

        Person janKowalski = new Person("Jan Kowalski", 40);
        Person ewaNowak = new Person("Ewa Nowak", 28);
        Person januszPanasewicz = new Person("Janusz Panasiewicz", 68);

        List<Person> persons = new ArrayList<>();
        persons.add(janKowalski);
        persons.add(ewaNowak);
        persons.add(januszPanasewicz);

        Person youngestPerson =  min(persons, new AgeComparator()) ;
        System.out.println(youngestPerson);

        List<String> strs = new ArrayList<>();
        strs.add("Blue");
        strs.add("Yellow");
        strs.add("Orange");

        String lowestString = min(strs, new StringComparator());
        System.out.println(lowestString);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(78);
        numbers.add(11);
        numbers.add(99);

        Integer lowestInteger = min(numbers, Integer::compare);
        System.out.println(lowestInteger);
    }

//    public static class Minimizer<T>{
//        public T min(ArrayList<T> o, Comparator comparator){
//            T val = Collections.min (o,comparator);
//            return val;
//        }
//
//    }
    private static <T> T min(List<T> values, Comparator<T> comparator){
        if(values.isEmpty()){
            throw new IllegalArgumentException("List is empty, cannot findminimum");
        }
        T lowestElement  =values.get(0);

        for(int i = 1; i < values.size(); i++){
            T elemet = values.get(i);
            if(comparator.compare(elemet, lowestElement) < 0){
                lowestElement = elemet;
            }
        }
        return lowestElement;
    }
}
