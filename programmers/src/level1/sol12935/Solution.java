package level1.sol12935;

import java.util.ArrayList;
import java.util.List;

// 제일 작은 수 제거하기 
public class Solution {
	public int[] solution(int[] arr) {

		// 배열의 길이가 1이면, 값을 -1로 바꿔서 리턴
		if (arr.length == 1) {
			arr[0] = -1;
			return arr;
		}

		// 배열의 길이가 1 초과면,
		int min = arr[0];
		int minIndex = 0;
		// arr 반목분 돌면서 작은 수의 인덱스 구하기
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				minIndex = i;
			}
		}
		// System.out.println(min);
		// System.out.println(minIndex);

		// arr를 그대로 복사한 list 생성
		List<Integer> list = new ArrayList<>();
		for (int num : arr) {
			list.add(num);
		}

		// minIndex를 통해 list에서 min 삭제
		list.remove(minIndex);

		// List to Array
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
}
