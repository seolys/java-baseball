package seol.baseball.common;

/**
 * 프로그램 커맨드.
 */
public enum CommandType {
	START("1"), EXIT("2");

	private final String command;

	CommandType(String command) {
		this.command = command;
	}

	public String getCommand() {
		return command;
	}

}
