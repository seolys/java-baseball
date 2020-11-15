package seol.baseball.common;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 숫자 목록.
 */
public class Numbers {

	private Set<Integer> numbers = new LinkedHashSet<>();

	public void add(int number) {
		if (1 > number || 9 < number) {
			throw new IllegalArgumentException("1~9 사이의 숫자만 입력 가능합니다.");
		}
		numbers.add(number);
	}

	public int size() {
		return numbers.size();
	}

	@Override
	public String toString() {
		return numbers.toString();
	}
}
