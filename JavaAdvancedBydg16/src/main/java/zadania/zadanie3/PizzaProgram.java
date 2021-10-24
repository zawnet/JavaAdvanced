package zadania.zadanie3;

import java.util.Scanner;

public class PizzaProgram {

    public static void main(String[] args) {
        Pizza pizza;

        Scanner input = new Scanner(System.in);
        int pizzaType=100;

        while (pizzaType  != 0 ){

            System.out.println("Wybierz pizze :");
            System.out.println("1 -> Cappriciosa\t0 -> KONIEC");
            pizzaType = input.nextInt();

            switch (pizzaType){
                case 1:
                    pizza = new Cappriciosa();
                    pizza = wybierzDodatki(pizza);
                    System.out.println("Twoja pizza to: " + pizza.pobierzNazwe() + " " + pizza.cena());
                    break;
                default:
                    break;
            }
        }
        //if(pizza != null) {

       // }
    }

   public static Pizza wybierzDodatki(Pizza pizza){
        System.out.println("Wybeirz dodatki: ");
        System.out.println("1 -> Powojne ciasto\t0 -> KONIEC");
        Scanner input = new Scanner(System.in);
        int dodatekType;
        while ((dodatekType = input.nextInt()) != 0){
            switch (dodatekType){
                case 1:
                    pizza = new PodwojneCiasto(pizza);
                    System.out.println(pizza.pobierzNazwe()+ " " + pizza.cena());
                default:
                    break;
            }
        }
        return pizza;
    }

}
