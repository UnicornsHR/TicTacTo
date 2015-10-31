package hello;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyUnitTest {

	@Test
	public void FirstPlayerMarkTest() {
		TTTGame TTT = new TTTGame();
		assertEquals('x', TTT.currPlayerMark);
	}
	@Test
	public void BoardSizeTest() {
		TTTGame TTT = new TTTGame();
		assertEquals(3, TTT.board.length);
		for(int r = 0; r < TTT.board.length; r++)
		{
			assertEquals(3, TTT.board[r].length);
		}
	}
	@Test
	public void ResetBoardTest() {
		TTTGame TTT = new TTTGame();
		for(int r = 0; r < 3; r++) {
			for(int c = 0; c < 3; c++) {
				assertEquals(' ', TTT.board[r][c]);
			}
		}
	}

/* @Test
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
