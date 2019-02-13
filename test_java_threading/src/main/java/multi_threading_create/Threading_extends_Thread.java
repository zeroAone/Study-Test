package multi_threading_create;

/**
 * 通过thread 创建线程
 */
public class Threading_extends_Thread {
   static class MyThreading extends Thread{
        @Override
        public void run() {
            while(true){
                System.out.println("hello threading!!!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        MyThreading myThreading=new MyThreading();
        myThreading.start();
    }
}
