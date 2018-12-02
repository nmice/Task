package week20;

public class Sample1 {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable());
        thread.join();
        thread.setDaemon(true);
        thread.start();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        while (true){
            System.out.println("BASH");
            for(long i = 0; i<1_000_000_000;i++);
        }
    }
}
