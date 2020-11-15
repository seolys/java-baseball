package seol.baseball.common;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import seol.baseball.common.exception.InputNumberInvalidException;

/**
 * 숫자 목록.
 */
public class Numbers {

	public static final int BEGIN_NUMBER = 1;
	public static final int END_NUMBER = 9;
	
	private Set<Integer> numbers = new LinkedHashSet<>();

	public void add(int number) {
		if (BEGIN_NUMBER > number || END_NUMBER < number) {
			throw new InputNumberInvalidException();
		}
		numbers.add(number);
	}

	public void add(String number) {
		add(Integer.parseInt(number));
	}

	public int size() {
		return numbers.size();
	}

	public Iterator<Integer> iterator() {
		return numbers.iterator();
	}

	@Override
	public String toString() {
		return numbers.toString();
	}

}
