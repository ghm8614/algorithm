package level1.sol12912;

// 두 정수 사이의 합
public class Solution {
	public long solution(int a, int b) {
		long answer = 0;

		// a와 b가 같으면 a 리턴
		if (a == b)
			return a;

		// a와 b가 다르면,
		if (a < b) {
			for (int i = a; i <= b; i++) {
				answer += i;
			}
		} else if (a > b) {
			for (int i = a; i >= b; i--) {
				answer += i;
			}
		}
		return answer;
	}
}
