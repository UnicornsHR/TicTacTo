package hello;
import java.util.Scanner;

public class HelloWorld {
  public static void main(String[] args) {
  // Greeter greeter = new Greeter();
  // System.out.println(greeter.sayHello()); 
//System.out.println("HELLO DAVID");

	int playAgain = 1;
	while (playAgain == 1) {
		TTTGame TicTacToe = new TTTGame();
		TicTacToe.printBoard();
		Scanner in = new Scanner(System.in);

		while (TicTacToe.isBoardFull() == false && TicTacToe.isThereAWinner() == false) {

			int x = in.nextInt();
			int y = in.nextInt();

			while(((x < 0) ||( x > 2)) || ((y < 0) || (y > 2))) {
				System.out.println("please enter numbers between 0 and 2");
				x = in.nextInt();
				y = in.nextInt();
			}

			while (TicTacToe.isSpotMarked(x, y) == true) {
                                        System.out.println ("This spot is already marked, choose an unmarked spot");
                                        x = in.nextInt();
                                        y = in.nextInt();
                        }

			TicTacToe.playGame(x,y);
			TicTacToe.printBoard();
			if (TicTacToe.isThereAWinner() == true) {
				System.out.println("We have a winner!");
			}

			else if (TicTacToe.isBoardFull() == true) {
				System.out.println("No winner...");
			}

			TicTacToe.changePlayer();
		}

		System.out.println("Choose 1 if you want to play again");
		playAgain = in.nextInt();
	}
  }
}
