package game;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyUnitTest {

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
