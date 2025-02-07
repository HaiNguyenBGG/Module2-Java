class Task extends Thread {
    private final Object lock;

    public Task(String name, Object lock) {
        super(name);
        this.lock = lock;
    }

    @Override
    public void run() {
        System.out.println(getName() + " đang chờ tài nguyên... (Waiting)");

        synchronized (lock) {
            System.out.println(getName() + " đã nhận tài nguyên và đang chạy... (Running)");

            try {
                // Mô phỏng thời gian xử lý
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(getName() + " đã hoàn thành công việc! (Terminated)");
        }
    }
}

public class MultiThreadingDemo {
    public static void main(String[] args) {
        Object lock = new Object();

        Task t1 = new Task("Thread 1", lock);
        Task t2 = new Task("Thread 2", lock);
        Task t3 = new Task("Thread 3", lock);

        System.out.println("Các thread được tạo nhưng chưa chạy... (New)");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();  // Chờ Thread 1 kết thúc
            t2.join();  // Chờ Thread 2 kết thúc
            t3.join();  // Chờ Thread 3 kết thúc
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Tất cả thread đã kết thúc! (Terminated)");
    }
}
