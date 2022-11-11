package level1.code_challenge_1.sol70128;

// 내적
public class Solution {
	public int solution(int[] a, int[] b) {
		int sum = 0;

		// 두 배열 모두 반복문 돌며, 같은 인덱스의 값을 곱한 것을 모두 더한다.
		for (int i = 0; i < a.length; i++) {
			sum += a[i] * b[i];
		}
		return sum;
	}
}
