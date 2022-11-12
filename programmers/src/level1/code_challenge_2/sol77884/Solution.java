package level1.code_challenge_2.sol77884;

// 약수의 개수와 덧셈
public class Solution {
	public int solution(int left, int right) {
		int result = 0;
		int divisor = 1;
		int totalDivisor = 0;

		// left부터 right 까지 반복문 돌기
		for (int i = left; i <= right; i++) {
			// left의 이중반복문 돌기
			for (int j = divisor; j <= i; j++) {
				// 만약 0으로 나누어 떨어지는 약수라면, 약수 개수 +1
				if (i % j == 0)
					totalDivisor++;
			}
			// 약수의 개수가 짝수개면 더하고, 홀수개면 빼기
			if (totalDivisor % 2 == 0) result += i;
			else result -= i;

			// 약수의 개수 리셋
			totalDivisor = 0;
		}
		return result;
	}

}
