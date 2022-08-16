package level1.sol12948;

public class Solution {
	// StringBuilder 메서드 사용 (replace())
	// 정답이지만 
	// 속도느림,비효율적
	public String solution(String phone_number) {
		StringBuilder sb = new StringBuilder(phone_number);
		StringBuilder star = new StringBuilder();
		int size = sb.length() - 4;

		for (int i = 0; i < size; i++) {
			star.append("*");
		}
		sb.replace(0, size, star.toString());

		return sb.toString();
	}
}
