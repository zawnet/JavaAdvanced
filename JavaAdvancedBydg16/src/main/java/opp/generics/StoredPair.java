package opp.generics;

public class StoredPair<T extends  Comparable<T>> {
    private final T first;
    private final T second;

    public StoredPair(T first, T second) {

        if(first.compareTo(second)<0){
            this.first = first;
            this.second = second;
        }
        else {
            this.first = second;
            this.second = first;
        }
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "StoredPair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public static void main(String[] args) {
        StoredPair<Integer> integerStoredPair1 = new StoredPair<>(1,2);
        System.out.println(integerStoredPair1);
        StoredPair<Integer> integerStoredPair2 = new StoredPair<>(2,1);
        System.out.println(integerStoredPair2);
    }
}
