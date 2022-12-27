package level1.sol134240;

// 푸드 파이트 대회
public class Solution {
	public String solution(int[] food) {
		StringBuilder sb = new StringBuilder();

		// 0 전까지 문자열
		// 1부터 length까지 반복
		// food[i]가 1이면 continue
		int length = food.length;
		for (int i = 1; i < length; i++) {
			if (food[i] == 1) continue;

			int cnt = 0;
			// 1보다 큰 홀수면, -1하고 2로 나눈 몫만큼 append (불필요한 하드코딩..)
			// Answer01에서 삭제 !
			if (food[i] % 2 != 0) cnt = (food[i] - 1) / 2;
			else cnt = food[i] / 2;

			for (int j = 0; j < cnt; j++) {
				sb.append(i);
			}
		}

		// 0 붙이고, 뒤집어서 붙이기
		String str = sb.toString() + "0";
		String reverseStr = sb.reverse().toString();

		return str + reverseStr;
	}
}
