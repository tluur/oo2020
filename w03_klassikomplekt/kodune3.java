/**
 * kodune3
 */
import java.time.Year;
import java.util.Scanner;
public class kodune3 {

    public static void main(String[] args) {
        Scanner uus = new Scanner(System.in);
        System.out.println("Sisesta auto mark: ");
        String mark = uus.nextLine().toLowerCase();
        System.out.println("Sisesta valmimisaasta: ");
        int aasta = uus.nextInt();
        System.out.println("Sisesta uste arv: ");
        int usteArv = uus.nextInt();

        kodune03 auto = new kodune03(mark, aasta, usteArv);

        System.out.println("Sinu auto : " + auto.getMark(mark));
        System.out.println(auto.getAasta(aasta));
        System.out.println("Kere tüüp : " + auto.getusteArv(usteArv));       
        
        
    }
}