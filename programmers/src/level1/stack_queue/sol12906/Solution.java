package level1.stack_queue.sol12906;

import java.util.ArrayList;
import java.util.List;

// 같은 숫자는 싫어
public class Solution {
	public int[] solution(int[] arr) {

		// 중복제거가 아니라, 연속되는 수 제거!
		// Set 개념 X
		List<Integer> list = new ArrayList<>();
		list.add(arr[0]);

		// arr to list
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] != arr[i]) {
				list.add(arr[i]);
			} else
				continue;
		}

		// list to array
		int[] intArr = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			intArr[i] = list.get(i);
		}

		return intArr;
	}
}
