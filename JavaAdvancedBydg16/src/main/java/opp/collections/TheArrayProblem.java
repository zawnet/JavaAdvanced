package opp.collections;

import java.sql.Array;
import java.util.Arrays;

public class TheArrayProblem {

    public static void main(String[] args) {

        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
//------PROBLEMY TABLIC --------------------------------------------------
        //Tworzenie
        Product[] products = {door, floorPanel};

        //WYpisywanie
        System.out.println(Arrays.toString(products));

        //Dodawanie

        Product window = new Product("Glass Window", 10);
        //products[2] = window;
        products = add(window,products);
        System.out.println(Arrays.toString(products));

        //Duplikaty
        products = add(window, products);
        System.out.println(Arrays.toString(products));

    }

    private static Product[] add(Product product, Product[] array){
        int lenght = array.length;
        Product[] newArray= Arrays.copyOf(array, lenght+1);
        newArray[lenght] = product;
        return  newArray;
    }
}
