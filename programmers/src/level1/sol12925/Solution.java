package level1.sol12925;

// 문자열을 정수로 바꾸기
public class Solution {
	public int solution(String s) {
		int answer = 0;
		char ch = s.charAt(0);

		// index 0이 부호면
		// index 1부터 끝까지 숫자로
		if (ch == '+') {
			answer = Integer.parseInt(s.substring(1));
		} else if (ch == '-') {
			answer = Integer.parseInt(s.substring(1)) * -1;
		} // 부호 없으면, 전부 숫자로
		else {
			answer = Integer.parseInt(s);
		}
		return answer;
	}
}
