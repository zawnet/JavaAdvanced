package lambdas;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static lambdas.Main.method;

public class Main {
    public static void main(String[] args) {

        List<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);

        //od Java 8
        PrintStream printWriter = System.out;

        items.forEach(printWriter::println);    //bardzo skrócone wyrażenie lambda

        items.forEach(item -> System.out.println(item));    //standardowe wyrażenia lambda

        items.forEach(item -> {
            int sum = item + item;
            System.out.println(sum);
        });

        String[] words = {"Ala", "ma", "kota", "kot", "ma", "Alę"};
        Arrays.sort(words, new StringComparator());
        System.out.println(Arrays.toString(words));

        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        System.out.println(Arrays.toString(words));


        Arrays.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

        Arrays.sort(words, (s1, s2) -> {
            int result = Integer.compare(s1.length(), s2.length());
            if(result == 0){
                result = s1.compareTo(s2);
            }
            return result;
        });

        System.out.println(Arrays.toString(words));

        method("t1", "t2", (t1, t2)->{
            return 0;
        });



        }
    static <T> void  method(T t1, T t2, FunctionalInterface<? super T> func){
    }

    static class StringComparator implements Comparator<String>{
        @Override
        public int compare(String o1, String o2) {
            return Integer.compare(o1.length(), o2.length());
        }
    }

    static interface FunctionalInterface<T>{
        int doSmth(T a1, T a2);
    }



}
