package level1.sol131705;

public class Solution {
	public int solution(int[] number) {
		int answer = 0;

		// number 배열 3중 반복문 돌기
		for (int i = 0; i < number.length - 2; i++) {
			for (int j = i + 1; j < number.length - 1; j++) {
				for (int k = j + 1; k < number.length; k++) {
					// i,j,k 번째 요소 다 더한 수가 0이면, answer++
					if ((number[i] + number[j] + number[k]) == 0) {
						answer++;
					}
				}
			}
		}

		return answer;
	}
}
