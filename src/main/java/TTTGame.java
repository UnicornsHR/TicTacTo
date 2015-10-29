package hello;

public class TTTGame{

	public char[][] board;
	public char currPlayerMark;

	public TTTGame(){
		board = new char[3][3];
		currPlayerMark = 'x';
		ResetBoard();
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
}
