package seol.baseball.answer;

import java.util.Random;
import seol.baseball.common.Numbers;

public class AnswerGenerator {

	/**
	 * 정답을 생성한다.
	 * @return
	 */
	public Numbers generate() {
		Numbers numbers = new Numbers();
		Random random = new Random();
		while (numbers.size() < 3) {
			numbers.add(random.nextInt(9) + 1);
		}
		return numbers;
	}

}
