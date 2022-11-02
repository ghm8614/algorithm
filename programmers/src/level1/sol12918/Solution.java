package level1.sol12918;

// 문자열 다루기 기본
public class Solution {
	public boolean solution(String s) {

		if (!(s.length() == 4 || s.length() == 6))
			return false;

		// NumberFormatException이 발생하지 않으면, true
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
}
