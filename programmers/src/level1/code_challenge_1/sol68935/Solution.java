package level1.code_challenge_1.sol68935;

// 3진법 뒤집기
public class Solution {
	public int solution(int n) {
		int answer = 0;
		int divisor = 3;
		StringBuilder sb = new StringBuilder();

		// 1. 10진법 -> 3진법
		// 몫이 0이 될 때까지,
		// 3으로 나눈 나머지를 순차적으로 나열 -> 앞뒤 반전의 3진법이 됨
		while (n != 0) {
			sb.append(Integer.toString(n % divisor));
			n /= divisor;
		}
		// System.out.println(sb);

		// 2. 3진법 -> 10진법
		int j = 1;
		for (int i = sb.length() - 1; i >= 0; i--) {
			answer += Integer.parseInt(sb.charAt(i) + "") * j;
			j *= 3;
		}

		return answer;
	}
}
