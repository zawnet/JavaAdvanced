package threads;

public class MyThread extends Thread{


    public MyThread() {
        setName("");
    }

    @Override
    public void run() {
        System.out.println("My first thread");
        System.out.println(Thread.currentThread().getName());
    }
}
