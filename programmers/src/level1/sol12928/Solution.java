package level1.sol12928;

// 약수 합 구하기
public class Solution {
	public int solution(int n) {
		int sumOfDivisor = 0;
		int divisor = 1;

		while (divisor <= n) {
			if (n % divisor == 0) {
				sumOfDivisor += divisor;
			}
			divisor++;
		}
		return sumOfDivisor;
	}
}
