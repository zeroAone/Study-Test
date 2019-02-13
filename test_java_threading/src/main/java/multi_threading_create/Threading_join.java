
package multi_threading_create;

public class Threading_join {
    static class MyThreading implements Runnable{
        Thread t1;
        public MyThreading(Thread thread){
            t1=thread;
        }
        @Override
        public void run() {
            try {
                t1.join();
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {
                    }
                    System.out.println(Thread.currentThread().getName() + "i:" + i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {
                    }
                    System.out.println(Thread.currentThread().getName() + "i:" + i);
                }
            }
        });
        t1.start();
        Thread t2 = new Thread(new MyThreading(t1),"Runnable");
        t2.start();
        // 当在主线程当中执行到t1.join()方法时，就认为主线程应该把执行权让给t1
        t1.join();
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
            System.out.println("main" + "i:" + i);
        }
    }
}
