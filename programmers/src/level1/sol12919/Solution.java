package level1.sol12919;

// 서울에서 김서방 찾기
public class Solution {
	public String solution(String[] seoul) {
		int kimIndex = 0;

		// for문 돌면서 Kim 인덱스 구하기
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				kimIndex = i;
			}
		}
		
		return "김서방은 " + kimIndex + "에 있다";
	}
}
