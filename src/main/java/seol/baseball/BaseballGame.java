package seol.baseball;

import seol.baseball.answer.AnswerGenerator;
import seol.baseball.checker.MatchChecker;
import seol.baseball.common.GameResult;
import seol.baseball.common.Numbers;
import seol.baseball.view.GameCompleteView;
import seol.baseball.view.GameStartView;

public class BaseballGame {

	private final GameStartView gameStartView;
	private final GameCompleteView gameCompleteView;
	private final AnswerGenerator answerGenerator;
	private final MatchChecker checker;

	public BaseballGame(ApplicationConfig config) {
		this.gameStartView = config.getGameStartView();
		this.gameCompleteView = config.getGameExitView();
		this.answerGenerator = config.getAnswerGenerator();
		this.checker = config.getMatchChecker();
	}

	public void play() {
		do {
			gameInProgress();
		} while (checkForContinue());
	}

	/**
	 * 게임 진행.<br/>
	 * 숫자 3개를 모두 맞출때까지 반복한다.
	 */
	private void gameInProgress() {
		Numbers answers = answerGenerator.generate();
		GameResult gameResult;
		do {
			gameResult = inputNumbersAndCheckForMatches(answers);
			System.out.println(gameResult);
		} while (!gameResult.isAllMatch());
		printAllMatchGuide();
	}

	/**
	 * 숫자입력 후 결과 체크.
	 */
	private GameResult inputNumbersAndCheckForMatches(Numbers answers) {
		Numbers inputs = gameStartView.inputNumbers();
		return checker.checkNumbers(answers, inputs);
	}

	/**
	 * 게임 진행.<br/>
	 * 숫자 3개를 모두 맞출때까지 반복한다.
	 */
	private void printAllMatchGuide() {
		gameCompleteView.printAllMatchInfo();
	}

	/**
	 * 게임을 계속 이어갈지 여부 확인.
	 */
	private boolean checkForContinue() {
		return gameCompleteView.isContinue();
	}

}
