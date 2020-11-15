package seol.baseball.answer;

import java.util.Random;
import seol.baseball.common.Numbers;

/**
 * 정답 숫자 생성기.<br/>
 * 1에서 9까지 서로 다른 임의의 수 3개를 선택할 수 있도록 한다.
 */
public class AnswerGenerator {

	public static final int ANSWER_SIZE = 3;
	private Random random = new Random();

	/**
	 * 정답을 생성한다.
	 */
	public Numbers generate() {
		Numbers numbers = new Numbers();
		while (numbers.size() < ANSWER_SIZE) {
			numbers.add(random.nextInt(9) + 1);
		}
		return numbers;
	}

}
