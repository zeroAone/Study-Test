package multi_threading_security;

public class ThreadTrain_synchronized implements Runnable {
    private int count=100;
    public ThreadTrain_synchronized() {
    }

    @Override
    public void run() {
        while (count>0){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sale();
        }
    }

    public  synchronized void sale() {
        if (count > 0) {
            System.out.println(Thread.currentThread().getName() + ",出售第" + (100 - count + 1) + "张票");
            count--;
        }
    }

    /**
     * 结论发现，多个线程共享同一个全局成员变量时，做写的操作可能会发生数据冲突问题
     * @param args
     * ①号,出售第31张票
     * ②号,出售第31张票
     */
    public static void main(String[] args) {
        ThreadTrain_synchronized threadTrain = new ThreadTrain_synchronized();
        Thread t1 = new Thread(threadTrain, "①号");
        Thread t2 = new Thread(threadTrain, "②号");
        t1.start();
        t2.start();
    }
}
