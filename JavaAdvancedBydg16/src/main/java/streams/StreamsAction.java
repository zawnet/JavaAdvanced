package streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsAction {
    public static void main(String[] args) {

        IntStream.range(1,10).forEach(num->System.out.print(num));
        IntStream.rangeClosed(1,10).forEach(System.out::println);

        DoubleStream.of(2.0).forEach(System.out::println);

        Stream stream = Stream.of("This", "is", "Java", "8", "stream"); //rzadko sie stosuje tworzenie isnstancji streama
        stream.forEach(str-> System.out.println(str + " "));

        Stream.of("This", "is", "Java", "8", "stream")
                .filter(s->s.contains("v")).forEach(System.out::println);

        String[] strings = { "Streams", "can", "be", "created", "from", "array"};

         //te które są posrednie swaracaja cały strumień (zwaracają Stream)
        //te które zwarają konkretną wartość np Ingeger, Optional to są końcowe

        //na streamach dość często stowowaną metodą jest metoda map

    }
}
