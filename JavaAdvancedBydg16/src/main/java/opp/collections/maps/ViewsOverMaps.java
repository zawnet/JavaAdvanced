package opp.collections.maps;

import opp.collections.Product;

import java.util.*;

public class ViewsOverMaps {

    private static Product door = new Product(1,"Wooden Door", 35);
    private static Product floorPanel = new Product(2, "Floor Panel", 25);
    private static Product window = new Product(3,"Window", 10);

    public static void main(String[] args) {

        Map<Integer, Product> products = new HashMap<>();
        products.put(door.getId(),door);
        products.put(floorPanel.getId(),floorPanel);
        products.put(window.getId(),window);

        System.out.println(products);
        Set<Integer> ids = products.keySet();
        ids.remove(1);
        System.out.println(ids);
        System.out.println(products);

        //nie można recznie dodawać nowej wartości do zobioru kluczy
        //ids.add(4);

        Collection<Product> values = products.values();

        System.out.println(values);
        values.remove(window);

        System.out.println(values);

       // values.add(window);

        products.put(door.getId(),door);
        products.put(window.getId(),window);

        Set<Map.Entry<Integer,Product>> entries = products.entrySet();
        for(Map.Entry<Integer, Product> entry : entries){
            System.out.println("Entry: "+entry);
            System.out.println("Key: "+entry.getKey());
            System.out.println("Value: "+entry.getValue());
        }

        Map.Entry<Integer,Product> entry = Map.entry(4,new Product(4, "Table",30));
        //entries.add(entry);

        System.out.println(products);
    }
}
