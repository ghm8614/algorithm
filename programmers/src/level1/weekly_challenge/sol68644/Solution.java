package level1.weekly_challenge.sol68644;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 두 개 뽑아서 더하기
public class Solution {
	public int[] solution(int[] numbers) {

		// 모든 수를 더하기, 중복없음
		Set<Integer> set = new HashSet<>();
		int[] answer;

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}
		// System.out.println(set);

		// set to array
		answer = new int[set.size()];
		int index = 0;
		for (int result : set) {
			answer[index++] = result;
		}

		// 오름차순 정렬
		Arrays.sort(answer);

		return answer;
	}
}
