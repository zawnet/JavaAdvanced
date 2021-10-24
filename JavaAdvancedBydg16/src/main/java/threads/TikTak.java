package threads;

public class TikTak {

    public void tik(boolean isRunning){
        if(!isRunning){
            notify();
            return;
        }

        System.out.println("Tik");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

    public void tak(boolean isRunning){
        if (isRunning){
            notify();
            return;
        }

        System.out.println("Tak");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}
