package streams;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class ProductsStreamsInAction {

    public static void main(String[] args) {

        List<Product> products = Product.PRODUCTS;

        Stream<Product> stream = products.stream()
                .map(product -> {
                    System.out.println(product);
                    return product;
        });

        //Lazy and
        stream.forEach(product -> {});

        System.out.println();
        System.out.println("FOOD:");
        products.stream()
                .filter(product -> product.getCategory() == ProductCategory.FOOD)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Nazwa produktu i cena:");
        products.stream()
                .map(product -> String.format("The price of %s is $ %.2f", product.getName(), product.getPrice()))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("map vs flat map");
        System.out.println();

        Pattern spaces = Pattern.compile(" ");
        products.stream()
                .map(product -> spaces.splitAsStream(product.getName()))
                .forEach(arr -> System.out.println(arr));

        products.stream()
                .flatMap(product -> spaces.splitAsStream(product.getName()))
                .forEach(arr -> System.out.println(arr));
    }
}
