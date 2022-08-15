package level1.sol12954;

public class Solution {

	// 오답, 테스트 실패
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		for (int i = 0; i < n; i++) {
			answer[i] = x * (i + 1);
		}

		return answer;
	}
}
