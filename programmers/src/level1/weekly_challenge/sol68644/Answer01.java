package level1.weekly_challenge.sol68644;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Iterator 사용
public class Answer01 {
	public int[] solution(int[] numbers) {
		Set<Integer> set = new HashSet<>();
		int[] answer;

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}
		// System.out.println(set);

		answer = new int[set.size()];
		int index = 0;
		
		// Iterator 
        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()){
            answer[index++] = iter.next();
        }

		Arrays.sort(answer);

		return answer;
	}
}
