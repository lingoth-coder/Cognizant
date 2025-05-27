class MyThread extends Thread {
    private String message;

    public MyThread(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + ": " + message + " (" + i + ")");
            try 
            {
                Thread.sleep(500);
            } 
            catch (InterruptedException e) 
            {
                System.out.println("Interrupted");
            }
        }
    }
}

public class ThreadMain {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread A working");
        MyThread t2 = new MyThread("Thread B working");

        t1.start();
        t2.start();
    }
}
