package opp.collections.maps;

import opp.collections.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListProductLookupTable implements ProductLookupTable{

    private  final List<Product> products = new ArrayList();

    @Override
    public Product lookupById(int id) {
        for(Product product : products){
            if (product.getId() == id){
                return product;
            }
        }
        return null;
    }


    @Override
    public void addProduct(Product product) {
        int id = product.getId();
        for (Product p : products){
            if(p.getId() == id){
                throw new IllegalArgumentException("Unable to add product, duplicate for: "+product);
            }
        }
        products.add(product);
    }

    @Override
    public void clear() {

        products.clear();

    }
}
