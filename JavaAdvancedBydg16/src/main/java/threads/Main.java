package threads;

import opp.collections.TheArrayProblem;

public class Main {
    public static void main(String[] args) {
        Thread thread = new MyThread();
       // thread.start(); //startujemy wątki metoda strart, natomiast to co ma się wykonać definiujemy w metodzie run

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("My second thread  "+ Thread.currentThread().getName());
            }
        });//cloud instance - wątek ktkory czeka na uruchominie
        thread.start(); //startujemy wątki metoda strart, natomiast to co ma się wykonać definiujemy w metodzie run
        //uruchomienie wątku
        thread1.start();

       new Thread(() -> {
                System.out.println("My thread thread  "+ Thread.currentThread().getName());
        }
        ).start();



    }
}
