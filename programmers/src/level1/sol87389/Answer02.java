package level1.sol87389;

import java.util.stream.IntStream;

// 스트림 사용
public class Answer02 {
	public int solution(int n) {
		return IntStream.range(2, n).filter(i -> n % i == 1).findFirst().orElse(0);
	}
}
