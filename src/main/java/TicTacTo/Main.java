package tictacto;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) { 

	nt playAgain = 1;
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
/*package tictacto;
import static spark.Spark.*;
import spark.*;
import spark.servlet.SparkApplication;

public class SparkGame implements SparkApplication{
	public static void main(String[] args){
		staticFileLocation("/public");
		SparkApplication SparkGame = new SparkGame();
		String port = System.getenv("PORT");
		if (port !=null){
			setPort(Integer.parseInt(port));
		}
		SparkGame.init();
	}
	public void init(){
		final TTTGame game = new TTTGame();
		post(new  Route("/init"){
		@Override
		public Object handle(Request request, Response response){
			response.status(200);
			game.printBoard();
			return response;
			}
		});
		/*post(new Route("/playerMove") {
		@Override
		public Object handle(Request request, Responce responce) {

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
}*/
