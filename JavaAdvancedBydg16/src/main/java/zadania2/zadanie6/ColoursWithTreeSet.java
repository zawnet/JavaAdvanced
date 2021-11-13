package zadania2.zadanie6;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ColoursWithTreeSet {
    private  final Set<String> coloursSet;

    public ColoursWithTreeSet() {
        coloursSet = new TreeSet<>((o1, o2) -> o1.compareTo(o2));
    }

    public void addWordsToSet(String[] words){
        for (String word : words){
            coloursSet.add(word);
        }
    }

    public Set<String> crateReverseTreeSet(){
        Set<String> treeSet = new TreeSet<>((o1, o2) -> -1*o1.compareTo(o2));
        treeSet.addAll(coloursSet);
        return treeSet;
    }

    public static void main(String[] args) {
        String words[] = {"Red", "Green", "Blue", "Black", "White", "Pink", "Red", "Yellow"};
        ColoursWithTreeSet coloursWithTreeSet = new ColoursWithTreeSet();

        coloursWithTreeSet.addWordsToSet(words);
        Set<String> coloursWithTreeSetReversed = coloursWithTreeSet.crateReverseTreeSet();


        coloursWithTreeSet.coloursSet.forEach(
                System.out::println
        );
        System.out.println("Reversed Colours Set: ");
        coloursWithTreeSetReversed.forEach(
                System.out::println
        );
    }
}
