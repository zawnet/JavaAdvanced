package opp.generics.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleBinaryOperator;

public class WildcardsWithLists {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1,2,3);
        List<Double> doubles = Arrays.asList(1.1d,2.2d,3.3d);
        printList(integers);
        printList(doubles);

        printWildcardList(integers);
        printWildcardList(doubles);


    }

    private static <T> void printList(List<T> list){
        System.out.println(list);
    }

    private static void printWildcardList(List<?> list){
        System.out.println(list);
    }
}
