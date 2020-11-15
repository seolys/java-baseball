package seol.baseball.checker;

import java.util.Iterator;
import seol.baseball.common.GameResult;
import seol.baseball.common.Numbers;
import seol.baseball.common.PitchType;

/**
 * 숫자 매치여부 Checker.(실행결과)<br/>
 * 같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 같은 수가 전혀 없으면 포볼 또는 낫싱이란 힌트를 얻고, 그 힌트를 이용해서 먼저 상대방(컴퓨터)의 수를 맞추면 승리한다.
 */
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
