package tictacto;
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
	}
}
