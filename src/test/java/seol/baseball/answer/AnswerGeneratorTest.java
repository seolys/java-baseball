package seol.baseball.answer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import seol.baseball.common.Numbers;

class AnswerGeneratorTest {

	@Test
	@DisplayName("3자리 수를 생성한다.")
	void generate() {
		// given
		AnswerGenerator generator = new AnswerGenerator();

		// when
		Numbers numbers = generator.generate();

		// then
		assertEquals(3, numbers.size());
		System.out.println("numbers = " + numbers);
	}

}