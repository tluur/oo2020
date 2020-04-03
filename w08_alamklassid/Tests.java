package app;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class Tests {

    private static int[][] CENTER = {
        {0,0,0},
        {0,TicTacToe.kasKoht,0},
        {0,0,0},
    };

    private static int[][] VIIK = {
        {TicTacToe.cpuKoht,TicTacToe.kasKoht,TicTacToe.cpuKoht},
        {TicTacToe.cpuKoht,TicTacToe.cpuKoht,TicTacToe.kasKoht},
        {TicTacToe.kasKoht,TicTacToe.cpuKoht,TicTacToe.kasKoht},
    };


    private int [][] emptyBoard;
    private int [][] draw;
    private int [][] centerx;

    @Before
    public void setUp(){
        centerx = CENTER.clone();
        draw = VIIK.clone();
    }


    @Test
    public void lubatudK2igud1(){
        assertTrue(TicTacToe.kasKoht(emptyBoard,0,0));
    }
    @Test

    public void lubatudK2igud2(){
        assertTrue(TicTacToe.kasKoht(emptyBoard,0,1));
    }
    @Test
    public void lubatudK2igud3(){
        assertTrue(TicTacToe.kasKoht(emptyBoard,0,2));
    }
    @Test
    public void lubatudK2igud4(){
        assertTrue(TicTacToe.kasKoht(emptyBoard,1,0));
    }
    @Test
    public void lubatudK2igud5(){
        assertTrue(TicTacToe.kasKoht(emptyBoard,1,1));
    }
    @Test
    public void lubatudK2igud6(){
        assertTrue(TicTacToe.kasKoht(emptyBoard,1,2));
    }
    @Test
    public void lubatudK2igud7(){
        assertTrue(TicTacToe.kasKoht(emptyBoard,2,0));
    }
    @Test
    public void lubatudK2igud8(){
        assertTrue(TicTacToe.kasKoht(emptyBoard,2,1));
    }
    @Test
    public void lubatudK2igud9(){
        assertTrue(TicTacToe.kasKoht(emptyBoard,2,2));
    }
    @Test
    public void lubatudK2igud10(){
        assertTrue(TicTacToe.kasKoht(emptyBoard,3,0));
    }
    @Test
    public void lubatudK2igud11(){
        assertTrue(TicTacToe.kasKoht(emptyBoard,0,3));
    }
    @Test
    public void lubatudK2igud12(){
        assertFalse(TicTacToe.kasKoht(emptyBoard,-1,0));
    }
    @Test
    public void lubatudK2igud13(){
        assertFalse(TicTacToe.kasKoht(emptyBoard,0,3));

    }

    @Test
    public void testIsDraw1(){
        assertFalse(TicTacToe.isDraw(centerx));
    }
    @Test
    public void testIsDraw2(){
        assertTrue(TicTacToe.isDraw(draw));
    }
}
