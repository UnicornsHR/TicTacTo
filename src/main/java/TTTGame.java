package game;

public class TTTGame{

	private char[][] board;
	private char currPlayerMark;

	public TTTGame(){
		board = new char[3][3];
		currPlayerMark = 'x';
		ResetBoard();
	}
	public char getCurrPlayerMark() {
		return currPlayerMark;
	}
	
	public void setCurrPlayerMark(char mark) {
		currPlayerMark = mark; 
	}
	
	public char getContentInCell(int r, int c) {
		return board[r][c];
	}
	
	public void setContentInCell(int r, int c, char mark) {
		board[r][c] = mark;
	}

	public void ResetBoard(){

		for(int r = 0; r < 3; r++) {
			for(int c = 0; c < 3; c++) {
				board[r][c] = ' ';
			}
		}
	}

	public void printBoard() {
		System.out.println("-------------");

		for(int r = 0; r < 3; r++) {
			System.out.print("| ");
			for(int c = 0; c < 3; c++) {
				System.out.print(board[r][c] + " | ");
			}
			System.out.println();
			System.out.println("-------------");
		}
	}

	public void changePlayer() {
		if(currPlayerMark == 'x') {
			currPlayerMark = 'o';
		}
		else {
			currPlayerMark = 'x';
		}
	}

	public boolean playGame(int r, int c) {
		boolean game = false;

		if ((r >= 0) && (r < 3)) {
			if ((c >= 0) && (c < 3)) {
				if (board[r][c] == ' ') {
					board[r][c] = currPlayerMark;
					game = true;
				}
			}
		}
		return game;
	} 

	public boolean isBoardFull() {
		boolean full = true;

		for(int r = 0; r < 3; r++) {
			for(int c = 0; c < 3; c++) {
				if (board[r][c] == ' ') {
					full = false;
				}
			}
		}
		return full;
	}

	public boolean isSpotMarked(int r, int c) {
		if (board[r][c] == ' ') {
			return false;
                }
		return true;
	}


	private boolean threeInARow(char c1, char c2, char c3) {
		if ((c1 != ' ') && (c2 == c1) && (c3 == c2)) {
			return true;
		}
		return false;
	}

	public boolean isThereAWinner() {
		boolean win = false;

		for (int count = 0; count < 3; count++) {
			//Skodar Columns
			if (threeInARow(board[0][count], board[1][count], board[2][count]) == true) {
				win = true;
			}
			//Skodar Rows
			else if (threeInARow(board[count][0], board[count][1], board[count][2]) == true) {
				win = true;
			}
			//Skodar kross ur vinstra horni uppi i haegra horn nidri
			else if (threeInARow(board[0][0], board[1][1], board[2][2]) == true) {
				win = true;
			}
			//Skodar kross ur vinstra horni nidri i haegra horn uppi
			else if (threeInARow(board[0][2], board[1][1], board[2][0]) == true) {
				win = true;
			}
		}
		return win;
	}

}
