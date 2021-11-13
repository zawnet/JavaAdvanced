package zadania2.zadanie1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Korzystając z właściwości kolekcji ArrayList, napisz program, który do kolekcji tego typu dodaje 6 różnych licz, a następnie je sortuje. Po wykonaniu tej operacji należy usunąć drugi element z listy, dodać nowy element do listy i wykonać ponowne sortowanie.
 */
public class IntNumbers {

    private final List<Integer> integerList;

    public IntNumbers() {
        this.integerList = new ArrayList<>();
    }

    public void generateElements(int numbersOfElements, int Min, int Max){
        Random random = new Random();
        for(int i=0; i<= numbersOfElements; i++){
            int number = Min + (int)(Math.random() * ((Max - Min) + 1));
            this.integerList.add(number);
        }
    }

    public void sortIntegerList(){
        Collections.sort(integerList);
    }

    public void removeElementFromIntegerList(int elementNumber){
       try {
           integerList.remove(elementNumber);
       }
       catch (IndexOutOfBoundsException ex){
           System.out.println("The element not found in list");
       }

    }

    public void addElementToIntegerList(int number){

        integerList.add(number);
    }

    public void showIntegerList(){
        System.out.println(integerList);
    }

    public static void main(String[] args) {

        IntNumbers intNumbers = new IntNumbers();

        intNumbers.generateElements(6,10,20);
        intNumbers.showIntegerList();
        intNumbers.sortIntegerList();
        intNumbers.removeElementFromIntegerList(10);
        intNumbers.addElementToIntegerList(9);
        intNumbers.sortIntegerList();
        intNumbers.showIntegerList();
    }


}
