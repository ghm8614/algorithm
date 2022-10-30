package level1.sol12903;

// substring(param1,param2) 사용
public class Answer01 {
	public String solution(String s) {
		String answer = "";
		int length = s.length();

		// length가 홀수면,
		if (length % 2 != 0) {
			answer = s.substring(length / 2, length / 2 + 1);
		}
		// length가 짝수면,
		else {
			answer = s.substring(length / 2 - 1, length / 2 + 1);
		}
		return answer;
	}
}
