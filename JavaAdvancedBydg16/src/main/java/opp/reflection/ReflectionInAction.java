package opp.reflection;

public class ReflectionInAction {

    public static void main(String[] args) {
        String hello = "Hello";
        Class helloClass = hello.getClass();

        String world = "Hello";
        Class worldClass = hello.getClass();
    }
}
