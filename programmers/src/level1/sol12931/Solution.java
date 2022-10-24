package level1.sol12931;

// 자릿수 더하기
public class Solution {
	public int solution(int n) {
		int answer = 0;

		// 나눈 몫이 1보다 작으면 반복종료
		while (n >= 1) {
			// 10으로 나눈 나머지 전부 더하기
			answer += n % 10;

			// 10으로 나눈 몫이 새로운 n
			n /= 10;
		}
		return answer;
	}
}
