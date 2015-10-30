package hello;
import java.util.Scanner;

public class HelloWorld {
  public static void main(String[] args) {
  // Greeter greeter = new Greeter();
  // System.out.println(greeter.sayHello()); 
//System.out.println("HELLO DAVID");

	TTTGame TicTacToe = new TTTGame();
	TicTacToe.printBoard();
	while (TicTacToe.isBoardFull() == false) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		while(((x < 0) ||( x > 2)) || ((y < 0) || (y > 2))) {
			System.out.println("please enter numbers between 0 and 2");
			x = in.nextInt();
			y = in.nextInt();
		}

		//int x = Integer.parseInt(in.readLine());
		//int y = Integer.parseInt(in.readLine());

		//Integer x = Integer.valueOf(request.queryParams("first"));
        	//Integer  y = Integer.valueOf(request.queryParams("second"));

		TicTacToe.playGame(x,y);
		TicTacToe.printBoard();
		if (TicTacToe.isThereAWinner() == true) {
			System.out.println("We have a winner!");
			System.exit(0);
		}
		else if (TicTacToe.isBoardFull() == true) {
			System.out.println("No winner...");
			System.exit(0);
		}
		TicTacToe.changePlayer();

		//x++;
		//y++;
	}

  }
}
