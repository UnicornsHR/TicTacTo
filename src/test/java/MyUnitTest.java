package hello;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyUnitTest {

	@Test
	public void firstPlayerMarkTest() {
		TTTGame TTT = new TTTGame();
		assertEquals('x', TTT.currPlayerMark);
	}
	@Test
	public void boardSizeTest() {
		TTTGame TTT = new TTTGame();
		assertEquals(3, TTT.board.length);
		for(int r = 0; r < TTT.board.length; r++)
		{
			assertEquals(3, TTT.board[r].length);
		}
	}
	@Test
	public void resetBoardTest() {
		TTTGame TTT = new TTTGame();
		for(int r = 0; r < 3; r++) {
			for(int c = 0; c < 3; c++) {
				assertEquals(' ', TTT.board[r][c]);
			}
		}

	}
	@Test
	public void changePlayerTest() {
		TTTGame TTT = new TTTGame();
		TTT.changePlayer();
		assertEquals('o', TTT.currPlayerMark);
		TTT.changePlayer();
		assertEquals('x', TTT.currPlayerMark);
	}
	@Test
	public void illegalPositionPlayGameTest() {
		TTTGame TTT = new TTTGame(); 
		assertEquals(false, TTT.playGame(-1, 0));
		assertEquals(false, TTT.playGame(0, -1));
		assertEquals(false, TTT.playGame(-1, -1));
		assertEquals(false, TTT.playGame(3, 0));
		assertEquals(false, TTT.playGame(0, 3));
		assertEquals(false, TTT.playGame(3, 3));
	}
	@Test
	public void cellAlreadyTakenPlayGameTest() {
		TTTGame TTT = new TTTGame();
		assertEquals(true, TTT.playGame(0, 0));
		TTT.playGame(0, 0);
		assertEquals(false, TTT.playGame(0, 0));
	}
/*@Test
    public void testHello() {
        Greeter greetertest= new Greeter();

        String result = greetertest.sayHello();

        assertEquals("Hello world!", result);

    }

/* @Test
    public void wrongtestHello() {
        Greeter greetertest= new Greeter();

        String result = greetertest.sayHello();

        assertEquals("world!", result);

    }*/

}
