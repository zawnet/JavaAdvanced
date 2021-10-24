package zadania.zadanie1;

public class StackProgram {
    public static void main(String[] args) {
        Stack<Integer> stackInt = new Stack<>();
        stackInt.setMaxSize(4);

        stackInt.add(1);
        stackInt.add(2);
        stackInt.add(3);
        stackInt.add(4);
        stackInt.add(5);
       // stackInt.add(6);

        System.out.println(stackInt);
        System.out.println(stackInt.pop());
        System.out.println(stackInt);

        System.out.println(stackInt.peek());


    }

}
