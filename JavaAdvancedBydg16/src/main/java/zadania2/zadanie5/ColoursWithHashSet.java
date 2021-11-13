package zadania2.zadanie5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ColoursWithHashSet {
    private  final Set<String> coloursSet;

    public ColoursWithHashSet() {
        coloursSet = new HashSet<>();
    }

    public void addWordsToSet(String[] words){
        for (String word : words){
            coloursSet.add(word);
        }
    }

    public void printStreamColoursFromSet(){
        coloursSet.stream()
                .forEach(System.out::println);
    }

    public void printColoursFromSet() {
        for (String colour : coloursSet){
            System.out.println(colour);
        }
    }

    public void printColoursWithStartWith(String letter){
        coloursSet.stream()
                .filter(s -> s.startsWith(letter))
                .forEach(System.out::println);
    }

    public void printSumColours() {
        System.out.println(coloursSet.size());
    }

    public static void main(String[] args) {
        String words[] = {"Red", "Blue", "Black", "White", "Pink", "Red", "Yellow"};
        ColoursWithHashSet coloursWithHashSet = new ColoursWithHashSet();
        coloursWithHashSet.addWordsToSet(words);
        coloursWithHashSet.printSumColours();
        //coloursWithHashSet.printColoursFromSet();
        coloursWithHashSet.printColoursWithStartWith("B");
    }


}
