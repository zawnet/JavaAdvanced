package zadania.zadanie3;

public class PodwojneCiasto extends Dodatki{
    private final Pizza pizza;

    public PodwojneCiasto(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public float cena() {
        return pizza.cena() + 2.99f;
    }

    @Override
    public String pobierzNazwe() {
        return pizza.pobierzNazwe() + " ,Podwójne ciasto";
    }
}
