package pluralsight.com;

public class Forloops {
    public static void main(String[] args) throws InterruptedException {
            for (int i = 10; i >= 1; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
            System.out.println("Launch!");
        }
    }

