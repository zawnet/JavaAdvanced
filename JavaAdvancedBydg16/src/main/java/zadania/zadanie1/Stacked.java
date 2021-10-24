package zadania.zadanie1;

public interface Stacked<T> {
    T add(T item);
    T pop();
    T peek();
}
