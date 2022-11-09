package level1.sol12940;

import java.util.ArrayList;
import java.util.List;

// 최대공약수와 최소공배수
// 하드코딩..
public class Solution {
	public int[] solution(int n, int m) {

		// n 약수들 나열
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				list.add(i);
		}
		// m 약수들 나열
		List<Integer> list2 = new ArrayList<>();
		for (int i = 1; i <= m; i++) {
			if (m % i == 0)
				list2.add(i);
		}
		// 공통 약수들 배열에 넣기
		List<Integer> list3 = new ArrayList<>();
		for (int i : list) {
			for (int j : list2) {
				if (i == j)
					list3.add(i);
			}
		}
		// 배열 마지막 인덱스 값이 최대공약수
		int gcd = list3.get(list3.size() - 1);

		// n,m의 곱을 최대공약수로 나눈 값이 최소공배수
		int[] answer = new int[2];
		answer[0] = gcd;
		answer[1] = n * m / gcd;
		
		return answer;
	}
}
