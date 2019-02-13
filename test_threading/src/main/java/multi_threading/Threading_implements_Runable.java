package multi_threading;

public class Threading_implements_Runable {
    static class MyThreading implements Runnable {
        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);
                    System.out.println("Runnable hello Threading!!!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread myThreading=new Thread(new MyThreading());
        myThreading.start();
    }
}
