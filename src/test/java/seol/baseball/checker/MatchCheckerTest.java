package seol.baseball.checker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import seol.baseball.common.GameResult;
import seol.baseball.common.Numbers;

@DisplayName("숫자 체크")
class MatchCheckerTest {

	@Test
	@DisplayName("3스트라이크")
	void match_success() {
		// given
		Numbers answers = new Numbers();
		answers.add(1);
		answers.add(2);
		answers.add(3);

		Numbers inputs = new Numbers();
		inputs.add(1);
		inputs.add(2);
		inputs.add(3);

		// when
		GameResult result = new MatchChecker().checkNumbers(answers, inputs);

		// then
		assertTrue(result.isAllMatch());
		assertEquals("3 스트라이크", result.getHint());
	}

	@Test
	@DisplayName("1 스트라이크 2볼(순서가 틀려서 실패)")
	void match_sort_fail() {
		// given
		Numbers answers = new Numbers();
		answers.add(1);
		answers.add(2);
		answers.add(3);

		Numbers inputs = new Numbers();
		inputs.add(3);
		inputs.add(2);
		inputs.add(1);

		// when
		GameResult result = new MatchChecker().checkNumbers(answers, inputs);

		// then
		assertFalse(result.isAllMatch());
		assertEquals("1 스트라이크 2볼", result.getHint());
	}

	@Test
	@DisplayName("3볼(숫자가 틀려서 실패)")
	void match_number_fail() {
		// given
		Numbers answers = new Numbers();
		answers.add(1);
		answers.add(2);
		answers.add(3);

		Numbers inputs = new Numbers();
		inputs.add(4);
		inputs.add(5);
		inputs.add(6);

		// when
		GameResult result = new MatchChecker().checkNumbers(answers, inputs);

		// then
		assertFalse(result.isAllMatch());
		assertEquals("3볼", result.getHint());
	}

}