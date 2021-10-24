package zadania.zadanie1;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> implements  Stacked<T>{



    private int maxSize;
    private List<T> stackList;
    private int top;


    public Stack() {
        this.maxSize = 0;
        this.stackList = new ArrayList<T>();
    }


    @Override
    public T add(T item) {
        if (!stackList.contains(item) ){
            if(maxSize>0 ){
                if (stackList.size() < maxSize) {
                    stackList.add(item);
                }
                else {
                    throw new UnsupportedOperationException("Operation is not allowed");
                }
            }
            else
            {
                stackList.add(item);
            }

            return item;
        }
        else {
            throw new UnsupportedOperationException("Operation is not allowed");
        }
    }

    @Override
    public T pop() {
        T element;
        if( (element = stackList.remove(stackList.size()-1)) != null ){
            return  element;
        }
        else {
            throw new UnsupportedOperationException("Operation is not allowed");
        }

    }

    @Override
    public T peek() {
        T element;
        if((element = stackList.get(stackList.size()-1)) != null ){
            return element;
        }
        else {
            throw new UnsupportedOperationException("Operation is not allowed");
        }

    }

    @Override
    public String toString() {
        return "Stack{" +
                "stackList=" + stackList +
                '}';
    }

    public void setMaxSize(int maxSize) {
        if(maxSize < 0){
            throw new IllegalArgumentException("Stack size must not be less tah 0");
        }
        this.maxSize = maxSize;
    }
}
