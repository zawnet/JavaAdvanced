package zadania2.zadanie2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Korzystając z właściwości kolekcji ArrayList, napisz program, który do kolekcji tego typu dodaje 6 różnych imion, a następnie je sortuje.
 */

public class NamesList {
    private final List<String> namesList;

    public NamesList() {
        this.namesList = new ArrayList<>();
    }

    public void generateNames(){
        namesList.add("Aneta");
        namesList.add("Ola");
        namesList.add("Paweł");
        namesList.add("Jaś");
        namesList.add("Urszula");
        namesList.add("Ryszayrd");
    }

    public void sortNamesList(){
        Collections.sort(namesList);
    }

    public void printNamesList(){
        System.out.println(namesList);
    }

    public static void main(String[] args) {
        NamesList namesList = new NamesList();
        namesList.generateNames();
        namesList.printNamesList();
        namesList.sortNamesList();
        namesList.printNamesList();
    }

}
