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
	@Test
	public void isboardFullTest() {
		TTTGame TTT = new TTTGame();
		assertEquals(false, TTT.isBoardFull());
		for(int r = 0; r < 3; r++) {
			for(int c = 0; c < 3; c++) {
				TTT.playGame(r, c);
				if (r == 2 && c == 2) {
					break;
				}
				assertEquals(false, TTT.isBoardFull());
			}
		}
		assertEquals(true, TTT.isBoardFull());
	}
	@Test
	public void rowsIsThereAWinnerTest() {
		TTTGame TTT = new TTTGame();
		assertEquals(false, TTT.isThereAWinner());
		for(int r = 0; r < 3; r++) {
			for(int c = 0; c < 3; c++) {
				TTT.playGame(r, c);
				if (c == 2) {
					break;
				}
				assertEquals(false, TTT.isThereAWinner());
			}
			assertEquals(true, TTT.isThereAWinner());
			for(int c = 0; c < 3; c++) {
				TTT.board[r][c] = ' ';
			}
		}
	}
	@Test
	public void columnsIsThereAWinnerTest() {
		TTTGame TTT = new TTTGame();
		assertEquals(false, TTT.isThereAWinner());
		for(int c = 0; c < 3; c++) {
			for(int r = 0; r < 3; r++) {
				TTT.playGame(r, c);
				if (r == 2) {
					break;
				}
				assertEquals(false, TTT.isThereAWinner());
			}
			assertEquals(true, TTT.isThereAWinner());
			//Hreinsum bordid a eftir okkur til ad geta kannad alla columns. 
			for(int r = 0; r < 3; r++) {
				TTT.board[r][c] = ' ';
			}
		}
	}
	@Test
	public void acrossToRightIsThereAWinnerTest() {
		TTTGame TTT = new TTTGame();
		assertEquals(false, TTT.isThereAWinner());
		TTT.playGame(0, 0);
		assertEquals(false, TTT.isThereAWinner());
		TTT.playGame(1, 1);
		assertEquals(false, TTT.isThereAWinner());
		TTT.playGame(2, 2);
		assertEquals(true, TTT.isThereAWinner());
	}
	@Test
	public void acrossToLeftIsThereAWinnerTest() {
		TTTGame TTT = new TTTGame();
		assertEquals(false, TTT.isThereAWinner());
		TTT.playGame(0, 2);
		assertEquals(false, TTT.isThereAWinner());
		TTT.playGame(1, 1);
		assertEquals(false, TTT.isThereAWinner());
		TTT.playGame(2, 0);
		assertEquals(true, TTT.isThereAWinner());
	}

}
