package chapter1;

public class Main1 {
    public static void main(String[] args) throws InterruptedException {
        Runnable logic = () -> {
            for (int i = 0; i < 30; i++) {
                System.out.println("Hello from thread");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    return;
                }
            }
        };

        Thread thread = new Thread(logic);
        thread.start();

        for (int i = 0; i < 30; i++) {
            System.out.println("Hello from main");
            Thread.sleep(300);
        }
    }
}
