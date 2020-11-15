package seol.baseball.common.exception;

public class InputNumberInvalidException extends IllegalArgumentException {

	public InputNumberInvalidException() {
		super("1~9 숫자 3자리만 입력해 주세요.");
	}

}
