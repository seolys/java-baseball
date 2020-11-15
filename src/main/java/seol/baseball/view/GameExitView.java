package seol.baseball.view;


import java.util.Scanner;
import seol.baseball.common.CommandType;

public class GameExitView {

	private Scanner scanner = new Scanner(System.in);

	public void printAllMatchInfo() {
		System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
	}

	public boolean isContinue() {
		String input;
		do {
			System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
			input = scanner.nextLine();
		} while (checkValidIsContinueInput(input));

		return CommandType.START.getCommand().equals(input);
	}

	private boolean checkValidIsContinueInput(String input) {
		return !CommandType.START.getCommand().equals(input) && !CommandType.EXIT.getCommand().equals(input);
	}

}
