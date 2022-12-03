package level1.sol12921;

// 효율적인 소수 판별법
// 제곱근보다 작은 소수로 나눈 후, 나누어 떨어지면 소수 o
public class Answer01 {
	public int solution(int n) {
		int primeCnt = 0;

		// 2부터 n까지 소수판별 반복문
		for (int i = 2; i <= n; i++) {
			boolean isPrime = true;

			// n 소수 판별
			for (int j = 2; j <= Math.sqrt(i); j++) {
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
