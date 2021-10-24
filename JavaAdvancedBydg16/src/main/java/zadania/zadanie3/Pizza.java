package zadania.zadanie3;

public abstract class Pizza {

    protected String nazwa = "";

    public String pobierzNazwe(){
        return nazwa;
    }

    public abstract float cena();

}
