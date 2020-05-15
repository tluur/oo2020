/**
 * Osaleja
 */
import java.util.Scanner;

public class Osaleja {
    private String marker; // Mängija märgid (X or O)

    Scanner in = new Scanner(System.in);

    public Osaleja(String _marker) {
        if (_marker != "X" && _marker != "O") {
            System.out.println("Vale märk, asendan X -ga");
            marker = "X";
        } else {
            marker = _marker;
        }
    }

    public String GetMarker() {
        return marker;
    }

    public int GetMove() {
        int move;
        do {
            System.out.println(); 
            System.out.println(marker + " kord. Sisesta number 1 kuni 9.");
            try {
                move = Integer.parseInt(in.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Sobivad numbrid ainult 1 kuni 9!");
                move = 0; // kordab kuni sobiva sisendini
            }
        } while (move < 1 || move > 9);

        return move;
    }
    

    
}