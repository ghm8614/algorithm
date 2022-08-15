package level1.sol12954;

public class Answer01 {

	// 형변환
	// 인덱스 활용해서 곱하기
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		for (int i = 0; i < n; i++) {
			answer[i] = (long) x * (i + 1);
		}

		return answer;
	}
}
