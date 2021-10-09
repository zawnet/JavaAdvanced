package opp.collections.maps;

import opp.collections.Product;

public interface ProductLookupTable {

    Product lookupById(int id);

    void addProduct(Product product);

    void clear();
}
