package level1.sol12910;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 나누어 떨어지는 숫자 배열
public class Solution {
	public int[] solution(int[] arr, int divisor) {
		List<Integer> list = new ArrayList<Integer>();

		// arr 배열 반복문 돌면서 divisor로 나눈 나머지가 0인 값, list에 추가
		for (int num : arr) {
			if (num % divisor == 0) {
				list.add(num);
			}
		}
		// System.out.println(list.size());

		// list size만큼의 크기를 가지는 answer 배열 생성
		int size = list.size();
		int[] answer = new int[(size == 0 ? 1 : size)];
		for (int i = 0; i < size; i++) {
			answer[i] = list.get(i);
		}

		// 오름차순 정렬
		Arrays.sort(answer);

		// list 값이 없다면 -1 넣어주기
		if (list.size() == 0) {
			answer[0] = -1;
		}

		return answer;
	}
}
