package multi_threading_create;

/**
 * 线程优先级
 */
public class Threading_Priority {
    static class PrioritytThread implements Runnable {
        public void run() {
            for (int i = 0; i < 100; i++) {
//                Thread.yield();   Thread.yield()方法的作用：暂停当前正在执行的线程，并执行其他线程。（可能没有效果）
//yield()让当前正在运行的线程回到可运行状态，以允许具有相同优先级的其他线程获得运行的机会。因此，使用yield()的目的是让具有相同优先级的线程之间能够适当的轮换执行。但是，实际中无法保证yield()达到让步的目的，因为，让步的线程可能被线程调度程序再次选中。
//结论：大多数情况下，yield()将导致线程从运行状态转到可运行状态，但有可能没有效果。
                System.out.println(Thread.currentThread().toString() + "---i:" + i);
            }
        }
    }

    public static void main(String[] args) {
        PrioritytThread prioritytThread = new PrioritytThread();
        Thread t1 = new Thread(prioritytThread);
        Thread t2 = new Thread(prioritytThread, "hello");
        t1.start();
        // 注意设置了优先级， 不代表每次都一定会被执行。 只是CPU调度会有限分配
        t1.setPriority(10);
        t2.start();
    }
}
