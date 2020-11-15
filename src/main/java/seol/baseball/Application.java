package seol.baseball;

public class Application {

	public static void main(String[] args) {
		BaseballGame baseBallGame = new BaseballGame(new ApplicationConfig());
		baseBallGame.play();
	}

}
