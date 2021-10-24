package threads;

import javax.swing.plaf.SeparatorUI;

public class MyThreadImplementedRunnable implements Runnable{

    private int counter;
    private String threadName;

    public MyThreadImplementedRunnable(String threadName) {
        this.threadName = threadName;
    }

    public int getCounter() {
        return counter;
    }

    public String getThreadName() {
        return threadName;
    }

    @Override
    public void run() {
        System.out.println(threadName + "starts");
        try {
            do {
                Thread.sleep(500);
                System.out.println(threadName + ", counter = "+ counter );
                counter++;
            } while (counter < 10);
        } catch (InterruptedException e) {
            System.out.println("Interrupted thread "+ threadName);
            //e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyThreadImplementedRunnable runnable
                = new MyThreadImplementedRunnable("Thread 1");

        Thread thread = new Thread(runnable);
        thread.start();

        do{
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("main thread interrputed");
            }
        }while (runnable.getCounter()!=10);

        System.out.println("Main thread ended");

    }



}
