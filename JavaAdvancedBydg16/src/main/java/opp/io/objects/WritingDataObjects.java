package opp.io.objects;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WritingDataObjects {

    public static void main(String[] args) {


        String fileName = "files/person.bat";
        File file = new File(fileName);

        Person p1 = new Person("Jan Kowalski", 28);
        Person p2 = new Person("Ewa Nowak", 20);

        try (OutputStream outputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {

            List<Person> people = new ArrayList<>();
            people.add(p1);
            people.add(p2);
            objectOutputStream.writeObject(people);

        } catch (IOException ex) {

        }
    }
}
