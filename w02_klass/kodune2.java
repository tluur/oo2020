/**
 * kodune2
 */
import java.util.Scanner;
public class kodune2 {

    public static void main(String[] args) {
        Scanner uus = new Scanner(System.in);
        System.out.println("Sisesta auto mark, valmimisaasta ja uste arv");
        String mark = uus.nextLine();
        int aasta = uus.nextInt();
        int usteArv = uus.nextInt();        
        kodune02 auto = new kodune02(mark, usteArv, usteArv);
        System.out.println("Sinu auto : " + auto.getMark(mark) + ". Ta on : " + auto.getYear (aasta) + ". Kere on temal : " + auto.getDoorCount(usteArv));
        
        
        
    }
}