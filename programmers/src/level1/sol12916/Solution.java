package level1.sol12916;

// 문자열 내 p와 y의 개수
public class Solution {
	boolean solution(String s) {
		int pCount = 0;
		int yCount = 0;

		// 문자열 전부 소문자로 변환
		s = s.toLowerCase();

		// p,y 모두 없을 시, true 리턴
		if (!(s.contains("p") || s.contains("y")))
			return true;

		// 반복문으로 p,y 개수 구하기
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'p') {
				pCount++;
			} else if (s.charAt(i) == 'y') {
				yCount++;
			}
		}
		return pCount == yCount ? true : false;
	}
}
