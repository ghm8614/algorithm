package level2.sol12941;

import java.util.Arrays;
import java.util.Collections;

// 최소값 만들기
public class Solution {
	public int solution(int[] A, int[] B) {
		int answer = 0;
		int length = A.length;

		// 배열 A 오름차순 정렬
		Arrays.sort(A);

		// 배열 B 내림차순 정렬
		Integer[] integerArrB = new Integer[length];
		for (int i = 0; i < length; i++) {
			integerArrB[i] = B[i];
		}
		Arrays.sort(integerArrB, Collections.reverseOrder());

		// 동일 인덱스 끼리 곱하면서 결과값 저장
		for (int i = 0; i < length; i++) {
			answer += A[i] * integerArrB[i];
		}

		return answer;
	}
}
