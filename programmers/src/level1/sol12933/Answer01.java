package level1.sol12933;

import java.util.Arrays;

public class Answer01 {
	public long solution(long n) {
		// 숫자를 문자열로 변환
		// Arrays의 sort() 메서드 사용위해 배열로 만들기
		String num = String.valueOf(n);
		char[] ch = num.toCharArray();

		// Arrays sort() 사용
		Arrays.sort(ch);

		// StringBuilder 의 reverse() 사용
		// StringBuilder를 String으로 변환
		String str = new StringBuilder(new String(ch)).reverse().toString();

		// String을 숫자로 변환
		return Long.parseLong(str);
	}
}
