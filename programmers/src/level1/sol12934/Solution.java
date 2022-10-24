package level1.sol12934;

// 정수 제곱근 판별
// Math 클래스 함수 사용
public class Solution {
	public long solution(long n) {
		long answer = 0;
		double sqrt = Math.sqrt(n);

		if (sqrt % 1 == 0.0) {
			// lossy conversion (형변환 주의)
			answer = (long) (sqrt + 1);
			answer *= answer;
			// System.out.println(answer);
		} else {
			answer = -1;
		}
		return answer;
	}
}
