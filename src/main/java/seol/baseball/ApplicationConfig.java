package seol.baseball;

import seol.baseball.answer.AnswerGenerator;
import seol.baseball.checker.MatchChecker;
import seol.baseball.view.GameCompleteView;
import seol.baseball.view.GameStartView;

public class ApplicationConfig {

	private GameStartView gameStartView = new GameStartView();
	private GameCompleteView gameCompleteView = new GameCompleteView();
	private AnswerGenerator answerGenerator = new AnswerGenerator();
	private MatchChecker matchChecker = new MatchChecker();

	public GameStartView getGameStartView() {
		return gameStartView;
	}

	public GameCompleteView getGameExitView() {
		return gameCompleteView;
	}

	public AnswerGenerator getAnswerGenerator() {
		return answerGenerator;
	}

	public MatchChecker getMatchChecker() {
		return matchChecker;
	}
	
}
