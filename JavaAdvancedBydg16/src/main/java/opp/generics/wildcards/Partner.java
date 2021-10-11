package opp.generics.wildcards;

public class Partner extends Person{
    public Partner(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age='" + getAge() + '\'' +
                '}';
    }
}
