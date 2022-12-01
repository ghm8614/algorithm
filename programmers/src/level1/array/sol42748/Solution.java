package level1.array.sol42748;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// K번째수
public class Solution {
	public int[] solution(int[] array, int[][] commands) {

		int startIndex = 0;
		int endIndex = 0;
		int num = 0;
		List<Integer> list = new ArrayList<>();
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {

			// 배열 잘라서 ArrayList에 넣기
			startIndex = commands[i][0] - 1;
			endIndex = commands[i][1];
			num = commands[i][2] - 1;
			for (int j = startIndex; j < endIndex; j++) {
				list.add(array[j]);
			}

			// 정렬
			Collections.sort(list);

			// list n번째 값을 answer 배열에 넣기
			answer[i] = list.get(num);

			// list 초기화
			list.clear();
		}

		return answer;
	}
}
