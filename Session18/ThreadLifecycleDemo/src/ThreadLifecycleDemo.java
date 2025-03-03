class MyThread extends Thread {
    private final Object lock;

    public MyThread(String name, Object lock) {
        super(name);
        this.lock = lock;
    }

    @Override
    public void run() {
        System.out.println(getName() + " đang chạy... (Running)");

        try {
            // Mô phỏng trạng thái Blocked/Waiting
            synchronized (lock) {
                System.out.println(getName() + " đang chờ tài nguyên... (Waiting)");
                lock.wait(2000); //
            }

            // Mô phỏng trạng thái Sleeping
            System.out.println(getName() + " đang tạm nghỉ... (Blocked/Sleeping)");
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(getName() + " đã kết thúc! (Terminated)");
    }
}

public class ThreadLifecycleDemo {
    public static void main(String[] args) {
        Object lock = new Object();

        MyThread t1 = new MyThread("Thread 1", lock);
        MyThread t2 = new MyThread("Thread 2", lock);

        System.out.println("Thread được tạo nhưng chưa chạy... (New)");

        t1.start(); // Chuyển sang trạng thái Runnable -> Running
        t2.start();

        try {
            Thread.sleep(500);
            synchronized (lock) {
                System.out.println("Main thread đánh thức các thread...");
                lock.notifyAll(); // Đánh thức tất cả thread đang chờ
            }

            t1.join(); // Đợi thread 1 kết thúc
            t2.join(); // Đợi thread 2 kết thúc

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Tất cả thread đã kết thúc! (Terminated)");
    }
}
