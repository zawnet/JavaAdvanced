package opp.collections.sets;

import opp.collections.Product;
import opp.collections.ProductComparator;
import opp.collections.Supplier;

import java.util.*;

public class ProductCatalogue implements Iterable<Product> {

    //    private final Set<Product> products = new HashSet<>();
    private final Set<Product> products = new TreeSet<>(new ProductComparator());

    public void addSupplier(Supplier supplier) {
        products.addAll(supplier.getProducts());
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }

    public Collection<Product> getProducts() {
        return products;
    }


}
