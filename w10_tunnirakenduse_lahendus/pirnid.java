import java.util.Random;

public class pirnid implements Runnable {
    Thread pirniThread;
    private String tName;
    private int inter;

    public pirnid(String tName, int inter) {
        this.tName = tName;
    }

    int min = 1;
    int max = 15;
    Random rand = new Random();
    int r = rand.nextInt(max - min) + min;
    int u = 0;

    @Override
    public void run() {
        System.out.println("Alustame pirnide lugemist korvis :");
        for (int i = 0; i < r; i++) {
            System.out.println((i + 1) + " pirn korvis.");
            u = u + 1;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }

        }
        System.out.println("Pirnide lugemine lõppenud " + u + " pirni oli korvis.");
    }

    public void start() {
        System.out.println("Thread 1 Käivitati");
        if (pirniThread == null) {
            pirniThread = new Thread(this, tName);
            pirniThread.start();
        }

    }

}