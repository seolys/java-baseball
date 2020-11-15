package seol.baseball;

import seol.baseball.answer.AnswerGenerator;
import seol.baseball.checker.MatchChecker;
import seol.baseball.common.GameResult;
import seol.baseball.common.Numbers;
import seol.baseball.view.GameExitView;
import seol.baseball.view.GameStartView;

public class BaseBallGame {

	private GameStartView gameStartView = new GameStartView();
	private GameExitView gameExitView = new GameExitView();
	private AnswerGenerator answerGenerator = new AnswerGenerator();
	private MatchChecker checker = new MatchChecker();

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

	private GameResult inputNumbersAndCheckForMatches(Numbers answers) {
		Numbers inputs = gameStartView.inputNumbers();
		GameResult gameResult = checker.checkNumbers(answers, inputs);
		return gameResult;
	}

	/**
	 * 게임 진행.<br/>
	 * 숫자 3개를 모두 맞출때까지 반복한다.
	 */
	private void printAllMatchGuide() {
		gameExitView.printAllMatchInfo();
	}

	/**
	 * 게임을 계속 이어갈지 여부 확인.
	 */
	private boolean checkForContinue() {
		return gameExitView.isContinue();
	}

}
