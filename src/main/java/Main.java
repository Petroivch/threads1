public class Main {

    public static final int NUMBER_OF_TREADS = 4;
    public static final int DELAY_TIME_MAIN = 15000;

    public static void main(String[] args) {
        System.out.println("Building and starting threads...");
        for (int i = 0; i < NUMBER_OF_TREADS; i++) {
            new MyThread("Thread " + (i + 1)).start();
        }
        try {
            Thread.sleep(DELAY_TIME_MAIN);
        } catch (InterruptedException err) {
            err.printStackTrace();
        }
        System.out.println("Finishing all threads:");
        Thread.currentThread().getThreadGroup().interrupt();
    }
}