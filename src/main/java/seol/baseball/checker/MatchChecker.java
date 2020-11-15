package seol.baseball.checker;

import java.util.Iterator;
import seol.baseball.common.GameResult;
import seol.baseball.common.Numbers;
import seol.baseball.common.PitchType;

public class MatchChecker {

	public GameResult checkNumbers(Numbers answerNumbers, Numbers inputNumbers) {
		Iterator<Integer> answers = answerNumbers.iterator();
		Iterator<Integer> inputs = inputNumbers.iterator();

		GameResult gameResult = new GameResult();
		while (answers.hasNext()) {
			PitchType result = checkNumber(answers.next(), inputs.next());
			gameResult.addPitch(result);
		}
		return gameResult;
	}

	private PitchType checkNumber(int answer, int input) {
		if (answer == input) {
			return PitchType.STRIKE;
		}
		return PitchType.BALL;
	}

}
