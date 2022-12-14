package level1.kakao_blind_2019.sol42889;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// 실패율
public class Solution {
	public int[] solution(int N, int[] stages) {

		double totalUser = stages.length;
		// 스테이지 별 도달자 수 배열
		int[] stageUserCnt = new int[N];
		// 실패율 담은 배열
		Double[] failRatio = new Double[N];
		// failRatil + 인덱스 담은 map
		Map<Integer, Double> map = new HashMap<>();
		// 결과 출력 배열
		int[] result = new int[N];

		// 스테이지 별 도달자 수 구하기
		for (int s : stages) {
			if (s <= N) {
				stageUserCnt[s - 1]++;
			}
		}
		// System.out.println(Arrays.toString(userCnt));

		// 실패율 계산 후 배열에 넣기
		// map<인덱스,value>에 저장
		for (int i = 0; i < N; i++) {
			if (totalUser == 0) {
				failRatio[i] = 0.0;
				map.put(i + 1, failRatio[i]);
			} else {
				failRatio[i] = stageUserCnt[i] / totalUser;
				map.put(i + 1, failRatio[i]);
				totalUser -= stageUserCnt[i];
			}

		}
		// System.out.println(Arrays.toString(failRatio));

		// 실패율 높은순으로 내림차순 정렬
		Arrays.sort(failRatio, Collections.reverseOrder());
		// System.out.println(Arrays.toString(failRatio));

		Set<Integer> set = map.keySet();
		for (int i = 0; i < failRatio.length; i++) {
			for (int s : set) {
				boolean isDone = false;
				if (failRatio[i] == map.get(s)) {
					result[i] = s;
					map.remove(s);
					isDone = true;
				}
				if (isDone)
					break;
			}
		}
		// System.out.println(Arrays.toString(result));

		return result;
	}
}
