package level1.s_w_coding.sol12982;

import java.util.Arrays;

// Solution 풀이에서 변수 하나를 더 줄일 수 있다. 
public class Answer01 {
	public int solution(int[] d, int budget) {
		// int sum = 0;
		int index = 0;

		// 1. 배열을 오름차순으로 정렬
		Arrays.sort(d);
		System.out.println(Arrays.toString(d));

		// 2. budget에서 정렬된 배열을 순차적으로 뺀 값이 0보다 작을 경우, 해당 index 리턴
		for (int i = 0; i < d.length; i++) {
			budget -= d[i];
			if (budget < 0) break;
			index++;
		}
		return index;
	}
}
