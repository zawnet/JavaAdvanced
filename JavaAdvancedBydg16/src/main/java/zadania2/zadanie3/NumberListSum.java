package zadania2.zadanie3;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberListSum {

    private final List<Integer> numbersList;

    public NumberListSum() {

        numbersList =  IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());
    }

    public void showSumNumbersList(){

        System.out.println(numbersList.stream().parallel()
                .reduce(0,(integer, integer2) -> integer+integer2));
    }

    public void showNumbersList(){
        numbersList.stream()
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        NumberListSum numberListSum = new NumberListSum();
        numberListSum.showNumbersList();
        numberListSum.showSumNumbersList();
    }
}
