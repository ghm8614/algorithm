package level1.sol12917;

import java.util.Arrays;

// String과 char[]의 관계 생각하며 코딩하기
public class Answer01 {
	public String solution(String s) {

		// string -> char[]
		char[] charArr = s.toCharArray();

		// 오름차순 정렬
		Arrays.sort(charArr);
		//System.out.println(Arrays.toString(charArr));

		// char[] -> string
		// StringBuilder reverse()
		return new StringBuilder(new String(charArr)).reverse().toString();
	}
}
