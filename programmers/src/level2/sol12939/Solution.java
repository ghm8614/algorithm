package level2.sol12939;

// 최대값과 최소값
public class Solution {
	public String solution(String s) {

		// 공백 기준 문자열 자르기
		String[] strArr = s.split(" ");
		int length = strArr.length;

		// String to int
		int[] intArr = new int[length];
		for (int i = 0; i < length; i++) {
			intArr[i] = Integer.parseInt(strArr[i]);
		}

		// 최대, 최소값 구하기
		int max = intArr[0];
		int min = intArr[0];
		for (int i = 1; i < length; i++) {
			max = Math.max(intArr[i], max);
			min = Math.min(intArr[i], min);
		}

		// 결과값
		StringBuilder sb = new StringBuilder();
		return sb.append(Integer.toString(min)).append(" ").append(Integer.toString(max)).toString();
	}
}
