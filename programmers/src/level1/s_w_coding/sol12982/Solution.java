package level1.s_w_coding.sol12982;

import java.util.Arrays;

// 예산
// 예산안에서 지원 가능한 부서의 최대수 구하기
public class Solution {
	public int solution(int[] d, int budget) {
		int sum = 0;
		int index = 0;

		// 1. 배열을 오름차순으로 정렬
		Arrays.sort(d);
		System.out.println(Arrays.toString(d));

		// 2. 정렬된 배열을 순차적으로 더한 값이 budget보다 큰 경우, 해당 index 리턴
		for (int i = 0; i < d.length; i++) {
			sum += d[i];
			if (sum > budget) {
				index = i;
				break;
			}
		}
		// 3. 배열을 모두 더한 값이 budget보다 작거나 같은 경우, 인덱스 + 1 or 배열의 모든 element 개수 리턴
		if (sum <= budget) {
			index = d.length;
		}

		return index;
	}
}
