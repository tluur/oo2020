
public class MyApp {

    private pirnid PirnidThread;
    private kurgid KurgidThread;

    public MyApp() {
        PirnidThread = new pirnid("t1", 50);
        KurgidThread = new kurgid("t2", 100);
    }

    public void start() {
        PirnidThread.start();
        KurgidThread.start();

    }

}