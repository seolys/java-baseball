package seol.baseball.common;

/**
 * 야구 피칭 타입.
 */
public enum PitchType {
	STRIKE(" 스트라이크"), BALL("볼");

	private final String typeName;

	PitchType(String typeName) {
		this.typeName = typeName;
	}

	public String getTypeName() {
		return typeName;
	}

}
