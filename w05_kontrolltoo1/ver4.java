import java.util.Scanner;

/**
 * ver4-kaalutudk_1
 */
//4 - Kaalutud keskmine
//* Koosta funktsioon, kus antakse ette kahe ainekursuse ainepunktid ja hinded. Arvuta nende põhjal kaalutud keskmine.  
public class ver4 {

    public static void main(String[] args) {
        System.out.println("Mitu hinnet soovid sisestada?");
        Scanner sisse = new Scanner(System.in);
        int n = sisse.nextInt();        
        int[] arr = new int[n];
        int kokku = 0;
        int keskmine = 0;
        int counter = 0;
        //Loeb sisestamise kordi.
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Sisesta hinne: " + (i + 1) + ": ");
            arr[i] = sisse.nextInt();
            counter++;
        }
        sisse.close();
        //arvutame mida soovime saada.
        for (int i = 0; i < arr.length; i++) {
            kokku = arr[i] + kokku;
        }
        keskmine = kokku / counter;
        //Hindame tulemusi ning vastavalt teeme väljaprindi
        System.out.println("Aine keskmine hinne on: " + keskmine);
        if (keskmine > 89) {
            System.out.println("Kaalutud keskmine põhjal on su tulem : A");
        } else if (keskmine > 79) {
            System.out.println("Kaalutud keskmine põhjal on su tulem : B");
        } else if (keskmine > 49) {
            System.out.println("Kaalutud keskmine põhjal on su tulem : C");
        } else {
            System.out.println("Kukkusid läbi");
        }

    }
}