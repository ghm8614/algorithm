package level1.sol12932;

// 자연수 뒤집어 배열로 만들기
public class Solution {
	public int[] solution(long n) {
		String str = String.valueOf(n);
		int[] answer = new int[str.length()];

		// n 자릿수 만큼 반복문 돌기
		// 10으로 나눈 나머지 순차적으로 배열에 넣기
		for (int i = 0; i < str.length(); i++) {
			// lossy conversion (형변환 주의)
			answer[i] = (int) (n % 10);
			n /= 10;
		}
		return answer;
	}
}
