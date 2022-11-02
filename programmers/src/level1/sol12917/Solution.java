package level1.sol12917;

import java.util.Arrays;

// 문자열 내림차순으로 배치하기
// 정답이긴 하지만 풀이과정이 복잡하고, String과 char[]의 관계를 활용하지 못함.
public class Solution {
	public String solution(String s) {
		// string을 int 배열로
		int[] intArr = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			intArr[i] = s.charAt(i) + 0;
		}
		// 오름차순 정렬
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		// int 배열을 string으로
		StringBuilder sb = new StringBuilder();
		for (int i : intArr) {
			sb.append((char) i);
		}
		// StringBuilder reverse()
		return new String(sb.reverse());
	}
}
