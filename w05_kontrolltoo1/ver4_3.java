import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.*;

/**
 * ver4_3
 */

// 4 - Kaalutud keskmine 
//Ülesanne : * Õppuri läbitud kursuste nimed, hinded (A-F) ja punktid loetakse sisse failist. Tulemus kaalutud keskmise näol kirjutatakse teise faili. 

public class ver4_3 {

    public static void main(String[] args) throws IOException {
        List<String> keskmine = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("hinded.txt")); // Määran faili millest loen sisse
                                                                                  // info.
        PrintStream writer = new PrintStream(new File("hinded_keskmine.txt")); // Määran failinime kuhu kirjutan
                                                                               // sulemuse

        // Hakkan ridu sisse lugema.
        String line = reader.readLine();
        while (line != null) {
            keskmine.add(line);
            line = reader.readLine();
        }
        //Hakkan arvutama keskmist hinnet, määran ära mitmendalt positsioonilt võtan info reast.
        int avg = 0;
        for (int i = 0; i < keskmine.size(); i++) {
            String[] lineContent = keskmine.get(i).split(" ");
            avg += Integer.parseInt(lineContent[2]);
        }

        //Kirjutan sulemi uude faili.
        PrintStream console = System.out;
        System.setOut(writer);
        System.out.println("Hinnete kaalutud keskmine: " + (avg / keskmine.size()) + " palli.");

    }
}