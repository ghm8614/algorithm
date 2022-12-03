package level1.sol12921;

// 소수 찾기
// 비효율적, 테스트 실패
public class Solution {
	public int solution(int n) {
		int primeCnt = 0;

		// 2부터 n까지 소수판별 반복문
		for (int i = 2; i <= n; i++) {
			boolean isPrime = true;

			// n 소수 판별
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				primeCnt++;
		}

		return primeCnt;
	}
}
