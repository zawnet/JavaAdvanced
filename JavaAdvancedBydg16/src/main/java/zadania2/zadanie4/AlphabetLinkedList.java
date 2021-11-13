package zadania2.zadanie4;

import javax.xml.stream.events.Characters;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AlphabetLinkedList {
    private  List<Character> characterList;

    public AlphabetLinkedList() {

        characterList = new LinkedList<>();
        LocalDateTime startTime = LocalDateTime.now();
        characterList = IntStream.rangeClosed(65, 90)
                .boxed()
                .map(c -> Character.valueOf((char) c.intValue()))
                .sorted()
                .collect(Collectors.toList());
        LocalDateTime endTime = LocalDateTime.now();
        Duration durationStreams = Duration.between(startTime, endTime);

        characterList = new LinkedList<>();
        startTime = LocalDateTime.now();
        for (int i = 65; i<= 90; i++){
            characterList.add((char) i);
        }
        Collections.sort(characterList);
        endTime = LocalDateTime.now();
        Duration duration = Duration.between(startTime, endTime);


        System.out.println(durationStreams.toMillis());
        System.out.println(duration.toMillis());
    }

    public static void main(String[] args) {

        AlphabetLinkedList alphabetLinkedList = new AlphabetLinkedList();
        alphabetLinkedList.characterList.stream()
                .forEach(System.out::println);
        alphabetLinkedList.characterList.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);
    }
}
