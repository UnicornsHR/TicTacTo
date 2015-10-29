package hello;

public class TTTGame{

	private char[][] board;
	private char currPlayerMark;

	public TTTGame(){
		board = new char[3][3];
		currPlayerMark = 'x';
		ResetBoard();
	}

	public void ResetBoard(){

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				board[i][j] = ' ';
			}
		}
	}

	public void printBoard() {
		System.out.println("-------------");

		for(int i = 0; i < 3; i++) {
			System.out.print("| ");
			for(int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " | ");
			}
			System.out.println();
			System.out.println("-------------");
		}
	}
}
