package level1.sol12903;

// 가운데 글자 가져오기
public class Solution {
	public String solution(String s) {
		String answer = "";
		int length = s.length();

		// length가 홀수면,
		if (length % 2 != 0) {
			answer += s.charAt(length / 2);
		}
		// length가 짝수면,
		else {
			answer += s.charAt(length / 2 - 1);
			answer += s.charAt(length / 2);
		}
		return answer;
	}
}
