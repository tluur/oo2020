package app;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static ArrayList<Integer> kasutajaKoht = new ArrayList<Integer>();
    static ArrayList<Integer> arvutiKoht = new ArrayList<Integer>();
    public static void main(String[] args) {

//mängulaud
        char [] [] gameBoard = {{' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+', '-'}, {' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+', '-'}, {' ', '|', ' ', '|', ' '}};

//prindib välja TTT mängulaua        
        printGameBoard(gameBoard);

 //mäng ise, kus lisatakse mängulauale märke ja samas kontrollitakse juba kas koht on vaba, et saaks märki lisada       
        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Vali oma märgi asukoht (1-9):"); //kasutaja saab valida kuhu ta oma märgi laual asetab
            int kasKoht = scan.nextInt();
            while(kasutajaKoht.contains(kasKoht) || arvutiKoht.contains(kasKoht)) { //kontrollitakse kas kasutaja valitud koht on vaba
                System.out.println("See asukoht on juba täis!");
                kasKoht = scan.nextInt();
            }
            
            asuKoht(gameBoard, kasKoht, "kasutaja"); //programm asetab sellele asukohale mängija sümboli
            String tulemus = kontVõitja(); //kontrollitakse kas on võitjat
            printGameBoard(gameBoard);

            System.out.println();
            System.out.println("Vastane teeb oma käigu"); //program genereerib ise ühe asukoha mängulaual kus ta asetab oma sümboli
            Random rand = new Random();
            int cpuKoht = rand.nextInt(9) + 1;
            while(kasutajaKoht.contains(cpuKoht) || arvutiKoht.contains(cpuKoht)) { //kontrollitakse kas arvuti valitud koht on vaba
                cpuKoht = rand.nextInt(9) + 1;
            }

            asuKoht(gameBoard, cpuKoht, "cpu");
            printGameBoard(gameBoard);
            
            tulemus = kontVõitja(); //kontrollitakse kas on võitjat
            if(tulemus.length() > 0){
                System.out.println(tulemus);
                break;
            }
            
        }
    }
//mängulaua "korrastamine" ehk kasutajale visuaalselt ilusa mängulaua kuvamine
    public static void printGameBoard(char[][] gameBoard){
        for(char[] row : gameBoard) {
            for(char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

//mängulauale märkide lisamine vastavalt kasutaja otsusele
    public static void asuKoht(char[][] gameBoard, int koht, String mangija) {

        char symbol = ' ';

        if(mangija.equals("kasutaja")){
            symbol = 'X';
            kasutajaKoht.add(koht);
        }else if(mangija.equals("cpu")){
            symbol = 'O';
            arvutiKoht.add(koht);
        }

        switch(koht) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] =symbol;
                break;
            default:
                break;
        }
    }
//võitmiseks vajalike ridade listidesse lisamine ja kontrollimine kas on olnud võitjat
    public static String kontVõitja() {

        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        List vasakCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List paremCol = Arrays.asList(3, 6, 9);
        List diag1 = Arrays.asList(1, 5, 9);
        List diag2 = Arrays.asList(3, 5, 7);
        
        List<List> voitmine = new ArrayList<List>();
        voitmine.add(topRow);
        voitmine.add(midRow);
        voitmine.add(botRow);
        voitmine.add(vasakCol);
        voitmine.add(midCol);
        voitmine.add(paremCol);
        voitmine.add(diag1);
        voitmine.add(diag2);

        for(List l : voitmine) {
            if(kasutajaKoht.containsAll(l)) {
                return "Palju õnne! Oled võitnud";
            }else if(arvutiKoht.containsAll(l)) {
                return "Arvuti võitis!";
            }else if(kasutajaKoht.size()+ arvutiKoht.size() == 9) {
                return "Viik! Mängulaud sai täis.";
            }
        }
        return "";
    }
}