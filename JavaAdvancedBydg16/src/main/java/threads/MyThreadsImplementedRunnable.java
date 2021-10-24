package threads;

public class MyThreadsImplementedRunnable implements Runnable{


    private int counter;
    private Thread thread;

    public MyThreadsImplementedRunnable(String threadName) {
        this.thread = new Thread(this, threadName);
        counter = 0;
        thread.start();
    }

    public int getCounter() {
        return counter;
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + "starts");
        try {
            do {
                Thread.sleep(500);
                System.out.println(thread.getName() + ", counter = "+ counter );
                counter++;
            } while (counter < 10);
        } catch (InterruptedException e) {
            System.out.println("Interrupted thread "+ thread.getName());
            //e.printStackTrace();
        }

        System.out.println("Thread "+ thread.getName()+ " ended");
    }

}
