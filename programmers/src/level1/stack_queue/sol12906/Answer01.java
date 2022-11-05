package level1.stack_queue.sol12906;

import java.util.ArrayList;
import java.util.List;

// tmp 임시변수를 통해 풀어갈 생각해보기
public class Answer01 {
	public int[] solution(int[] arr) {

		List<Integer> list = new ArrayList<>();
		list.add(arr[0]);
		int tmp = arr[0];

		// arr to list
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != tmp) {
				tmp = arr[i];
				list.add(arr[i]);
			} else
				continue;
		}

		// list to array
		int[] intArr = new int[list.size()];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = list.get(i);
		}

		return intArr;
	}
}
