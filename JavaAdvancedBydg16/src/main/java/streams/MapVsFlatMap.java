package streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MapVsFlatMap {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4);
        List<Product> products = Product.PRODUCTS;

        //Tak działa normalna funkcja map
        List<List<Integer>> mapped = numbers.stream()
                .map(number -> Arrays.asList(number - 1, number, number + 1))
                .collect(Collectors.toList());
        System.out.println(mapped);

        Pattern spaces = Pattern.compile("\\s+");
        //Tak działa flatMap
        products.stream()
                .flatMap(product -> spaces.splitAsStream(product.getName()))
                .forEach(arr -> System.out.println(arr));
        System.out.println(mapped);

        Optional<Product> opt = products.stream()
                .filter(product -> product.getCategory() == ProductCategory.OFFICE)
                .findAny();
        opt.ifPresent(System.out::println);

        opt = products.stream()
                .filter(product -> product.getCategory() == ProductCategory.OFFICE)
                .findAny();

        opt.ifPresent(System.out::println);

        boolean isCleaningProduct = products.stream()
                .anyMatch(product -> product.getCategory() == ProductCategory.CLEANING);
        System.out.println("Does tge list of products contains cleaning product? " + isCleaningProduct);

        boolean isProductsAreExpensive = products.stream()
                .allMatch(product -> product.getPrice().compareTo(new BigDecimal("10.0")) > 0);
        System.out.println("Are all products expensive? " + isProductsAreExpensive);

        boolean isProductsAreCheap = products.stream()
                .noneMatch(product -> product.getPrice().compareTo(new BigDecimal("10.0")) > 0);
        System.out.println("Are all products cheap? " + isProductsAreCheap);

        List<Product> foodProducts = new ArrayList<>();
        products.stream()
                .filter(product -> product.getCategory() == ProductCategory.FOOD)
                .forEach(foodProducts::add);
//                .forEach(product -> foodProducts.add(product));

        System.out.println(foodProducts);

        foodProducts = products.stream()
                .filter(product -> product.getCategory() == ProductCategory.OFFICE)
                .collect(Collectors.toList());

        System.out.println(foodProducts);

        List<String> cleaningProductNames = products.stream()
                .filter(product -> product.getCategory() == ProductCategory.CLEANING)
                .map(product -> product.getName())
                .collect(Collectors.toList());

        System.out.println(cleaningProductNames);

        String categories = products.stream()
                .map(product -> product.getCategory().toString())
                .distinct()
                .collect(Collectors.joining(";"));

        System.out.println(categories);

        List<String> sortedNames = products.stream()
                .map(Product::getName)
//                .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedNames);

    }
}
