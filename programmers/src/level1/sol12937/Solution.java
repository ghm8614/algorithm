package level1.sol12937;

// 짝수와 홀수
public class Solution {
	public String solution(int num) {
		String answer = "";
		if (num % 2 == 0)
			answer = "Even";
		else
			answer = "Odd";
		return answer;
	}
}
