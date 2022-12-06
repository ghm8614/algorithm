package level1.weekly_challenge.sol68644;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;

// 정렬되는 TreeSet 사용
public class Answer02 {
	public int[] solution(int[] numbers) {
		Set<Integer> set = new TreeSet<>();
		int[] answer;

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}
		// System.out.println(set);

		answer = new int[set.size()];
		int index = 0;

		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			answer[index++] = iter.next();
		}

		// TreeSet 사용하므로, 생략가능
		// Arrays.sort(answer);

		return answer;
	}
}
