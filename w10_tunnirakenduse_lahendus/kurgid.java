import java.util.Random;

public class kurgid implements Runnable {
    Thread kurgidThread;
    private String tName;
    private int inter;

    public kurgid(String tName, int inter) {
        this.tName = tName;
    }

    int min = 1;
    int max = 12;
    Random rand = new Random();
    int r = rand.nextInt(max - min) + min;
    int u = 0;

    @Override
    public void run() {
        System.out.println("Alustame kurkide lugemist ämbris :");
        for (int i = 0; i < r; i++) {
            System.out.println((i + 1) + " kurki korvis.");
            u = u + 1;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }

        }
        System.out.println("Kurkide lugemine lõppenud " + u + " kurki oli ämbris.");
    }

    public void start() {
        System.out.println("Thread 2 Käivitati");
        if (kurgidThread == null) {
            kurgidThread = new Thread(this, tName);
            kurgidThread.start();
        }

    }

}