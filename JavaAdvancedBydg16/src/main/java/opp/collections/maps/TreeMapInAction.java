package opp.collections.maps;

import opp.collections.Product;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapInAction {

    public static Product door = new Product(1,"Wooden Door", 35);
    public static Product floorPanel = new Product(2, "Floor Panel", 25);
    public static Product window = new Product(3,"Window", 10);

    public static void main(String[] args) {
        Map<Integer, Product> products = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return Integer.compare(i1,i2);
            }
        });

        products.put(door.getId(),door);
        products.put(floorPanel.getId(),floorPanel);
        products.put(window.getId(),window);

        System.out.println(products);

    }
}
