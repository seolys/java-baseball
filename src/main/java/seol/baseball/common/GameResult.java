package seol.baseball.common;

import java.util.EnumMap;
import java.util.Map;
import java.util.StringJoiner;

/**
 * 게임 결과.
 */
public class GameResult {

	private final Map<PitchType, Integer> results = new EnumMap<>(PitchType.class);

	public void addPitch(PitchType result) {
		results.put(result, results.getOrDefault(result, 0) + 1);
	}

	public boolean isAllMatch() {
		return results.getOrDefault(PitchType.STRIKE, 0) == 3;
	}

	public String getHint() {
		return toString();
	}

	@Override
	public String toString() {
		StringJoiner sb = new StringJoiner(" ");
		for (PitchType pitch : PitchType.values()) {
			addToString(pitch, sb);
		}
		return sb.toString();
	}

	private void addToString(PitchType pitch, StringJoiner sb) {
		Integer pitchCount = results.getOrDefault(pitch, 0);
		if (pitchCount == 0) {
			return;
		}
		sb.add(pitchCount + pitch.getTypeName());
	}

}
