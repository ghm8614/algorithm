package level1.exhaustive_search.sol86491;

import java.util.Arrays;

// 최소 직사각형
public class Solution {
	public int solution(int[][] sizes) {
		int wMax;
		int hMax;

		// 큰 수가 뒤로 오도록, 1차원 배열 모두 정렬
		for (int i = 0; i < sizes.length; i++) {
			Arrays.sort(sizes[i]);
		}

		// 인덱스 0, 1의 최대값 구하기
		wMax = sizes[0][0];
		hMax = sizes[0][1];
		for (int i = 1; i < sizes.length; i++) {
			if (wMax < sizes[i][0])
				wMax = sizes[i][0];
			if (hMax < sizes[i][1])
				hMax = sizes[i][1];
		}

		return wMax * hMax;
	}
}
