package seol.baseball.view;


import java.util.Scanner;
import seol.baseball.common.Numbers;

public class GameStartView {

	private Scanner scanner = new Scanner(System.in);

	public Numbers inputNumbers() {
		System.out.print("숫자를 입력해주세요 : ");
		String[] splitNumbers = scanner.nextLine().split("");

		Numbers numbers = new Numbers();
		for (String splitNumber : splitNumbers) {
			numbers.add(splitNumber);
		}
		return numbers;
	}

}
