package level1.sol12915;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 문자열 내 마음대로 정렬하기
public class Solution {
	public String[] solution(String[] strings, int n) {
		// 풀이방법
		// 1. n번째 인덱스의 문자를 문자열 맨 앞에 붙인다.
		// 2. 정렬한다.
		// 3. 맨앞 문자를 제거한 후, 배열에 저장한다.

		// n번째 인덱스 문자가 동일해도, 뒤 문자들을 통해 정렬됨

		String[] answer = {};

		List<String> list = new ArrayList<>();

		for (String str : strings) {
			list.add(str.charAt(n) + str);
		}

		Collections.sort(list);

		answer = new String[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i).substring(1, list.get(i).length());
		}

		return answer;
	}
}
