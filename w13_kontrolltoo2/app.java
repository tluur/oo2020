import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        Scanner sisse = new Scanner(System.in);

        System.out.print("Sisesta pendli pikkus :");
        int Ppikkus = sisse.nextInt();

        System.out.print("Sisesta hammasrataste arv :");
        int hamArv = sisse.nextInt();

        pendel yks1 = new pendel(Ppikkus);
        int val = (int) yks1.getVonkeperiood();

        hammasr kaks2 = new hammasr(hamArv, yks1.getVonkeperiood());
        int ham = (int) kaks2.getHammPöörded();

        System.out.println();
        System.out.println(hamArv + " hammasratast alustavad pöörlemisega. ");
        System.out.println();
        System.out.println("Pendli võnkeperiood on " + yks1.getVonkeperiood() + " s.");
        System.out.println();

        Timer t = new Timer();
        t.schedule(new TimerTask() {
            public int e = 0;

            public void run() {

                System.out.println("Pendel tegi Tik ning  hammasratast on teinud " + ++e * ham + " pööret.");

            }
        }, 0, val * 1000);
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.cancel();

        System.out.println();
        System.out.println("Ajaline piirang.");
        System.out.println("Seiskumine.");

    }

}