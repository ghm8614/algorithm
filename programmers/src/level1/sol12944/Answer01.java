package level1.sol12944;

import java.util.Arrays;

public class Answer01 {
	// Stream
	public double solution(int[] arr) {
		return (double) Arrays.stream(arr).average().orElse(0);
	}
}
