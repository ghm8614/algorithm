package level1.exhaustive_search.sol42840;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 모의고사
public class Answer01 {
	public int[] solution(int[] answers) {

		// 반복되는 패턴을 담는 배열 선언
		int[] one = { 1, 2, 3, 4, 5 };
		int[] two = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] three = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int[] score = new int[3];

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == one[i % 5])
				score[0]++;
			if (answers[i] == two[i % 8])
				score[1]++;
			if (answers[i] == three[i % 10])
				score[2]++;
		}
		// System.out.println(Arrays.toString(score));

		// 수포자의 최대 정답수 배열에 넣기
		int max = Math.max(score[0], Math.max(score[1], score[2]));
		List<Integer> list = new ArrayList<>();
		if (max == score[0])
			list.add(1);
		if (max == score[1])
			list.add(2);
		if (max == score[2])
			list.add(3);
		Collections.sort(list);

		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
}
