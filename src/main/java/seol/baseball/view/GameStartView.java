package seol.baseball.view;


import java.util.Scanner;
import seol.baseball.common.Numbers;
import seol.baseball.common.exception.InputNumberInvalidException;

/**
 * 게임 시작 시 View.
 */
public class GameStartView {

	private Scanner scanner = new Scanner(System.in);

	public Numbers inputNumbers() {
		System.out.print("숫자를 입력해주세요 : ");
		String[] splitNumbers = scanner.nextLine().split("");
		checkValidation(splitNumbers);

		Numbers numbers = new Numbers();
		for (String splitNumber : splitNumbers) {
			numbers.add(splitNumber);
		}
		return numbers;
	}

	private void checkValidation(String[] splitNumbers) {
		if (splitNumbers.length != 3) {
			throw new InputNumberInvalidException();
		}
		for (String number : splitNumbers) {
			checkDigit(number);
		}
	}

	private void checkDigit(String str) {
		if (str == null || str.isEmpty()) {
			throw new InputNumberInvalidException();
		}
		if (!Character.isDigit(str.charAt(0))) {
			throw new InputNumberInvalidException();
		}
	}

}
