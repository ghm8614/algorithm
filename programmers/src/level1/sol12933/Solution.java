package level1.sol12933;

import java.util.Arrays;

// 정수 내림차순으로 배치하기
public class Solution {
	public long solution(long n) {
		// 숫자를 문자열로 변환
		// Arrays의 sort() 메서드 사용위해 배열로 만들기
		String[] num = String.valueOf(n).split("");

		// Arrays sort() 사용
		Arrays.sort(num);

		// StringBuilder 의 reverse() 사용
		StringBuilder sb = new StringBuilder();
		for (String str : num) {
			sb.append(str);
		}
		sb.reverse();
		System.out.println(sb);

		// StringBuilder를 String으로 변환
		// String을 숫자로 변환
		return Long.parseLong(new String(sb));
	}
}
