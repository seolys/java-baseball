package seol.baseball.common;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumbersTest {

	@Test
	@DisplayName("값 입력 테스트")
	void add() {
		Numbers numbers = new Numbers();
		for (int i = 1; i <= 9; i++) {
			numbers.add(i);
		}
	}

	@Test
	@DisplayName("값 유효성체크 테스트")
	void add_validation_check() {
		Numbers numbers = new Numbers();
		assertThatIllegalArgumentException()
				.isThrownBy(() -> numbers.add(0));

		assertThatIllegalArgumentException()
				.isThrownBy(() -> numbers.add(10));
	}

}