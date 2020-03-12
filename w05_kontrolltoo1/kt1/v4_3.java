import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.*;

/**
 * v4_3
 * Õppuri läbitud kursuste nimed, hinded (A-F) ja punktid loetakse sisse failist. Tulemus kaalutud keskmise näol kirjutatakse teise faili. 
 */
public class v4_3 {
    public static void main(String[] args) throws IOException {
        List<String> keskmine = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("hinded.txt")); // Määran faili millest loen sisse info.        
        PrintStream writer = new PrintStream(new File("hinded_keskmine.txt")); // Määran failinime kuhu kirjutan tulemuse.    

        // Hakkan ridu sisse lugema.
        String line = reader.readLine();
        while (line != null) {
            keskmine.add(line);
            line = reader.readLine();
        }
         
        int hinded = 0;        
        int punktid = 0;        
        int totalPunktid = 0;
        float total = 0;
        String A = "A";
        String B = "B";
        String C = "C";
        String D = "D";
        String E = "E";
        String F = "F";

        for (int i = 0; i < keskmine.size(); i++) {
            
            String[] lineContent = keskmine.get(i).split(" ");
            String margitud = lineContent[1];
            punktid= Integer.parseInt(lineContent[2]);
            if (margitud.equals(A)) {
                hinded = 5;
            } else if (margitud.equals(B)) {
                hinded = 4;
            } else if (margitud.equals(C)) {
                hinded = 3;
            } else if (margitud.equals(D)) {
                hinded = 2;
            }else if (margitud.equals(E)) {
                hinded = 2;
            }else if (margitud.equals(F)) {
                hinded = 1;
            }else {
                hinded = 0;
            }            
            
            totalPunktid = punktid + totalPunktid;
            total += (hinded * punktid); 

        }

        // Kirjutan tulemi uude faili.
        PrintStream console = System.out;
        System.setOut(writer);
        System.out.println("Hinnete kaalutud keskmine: " + total / totalPunktid + " palli.");

    }
}
