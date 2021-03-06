public class MyThread extends Thread {

    public final int DELAY_TIME = 2500;

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            while(!isInterrupted()) {
                Thread.sleep(DELAY_TIME);
                System.out.printf("My name is %s. Hello everyone!\n", getName());
            }
        } catch (InterruptedException err) {
            Thread.currentThread().interrupt();
        } finally{
            System.out.printf("%s finished\n", getName());
        }
    }
}