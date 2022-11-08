package level1.sol12930;

// 이상한 문자 만들기
// 주의: 하나 이상의 공백문자로 구분
public class Solution {
	public String solution(String s) {

		// 공백 기준으로 s를 여러 단어 나눔
		StringBuilder sb = new StringBuilder();
		String[] strArr = s.split(" ", -1);

		// 반복문 돌려서 각 문자열에 접근
		for (int i = 0; i < strArr.length; i++) {
			// 한 문자열의 문자에 접근
			// 짝수 인덱스 -> 대문자로 / 홀수 인덱스 -> 그대로
			for (int j = 0; j < strArr[i].length(); j++) {
				if (j % 2 == 0)
					sb.append(Character.toUpperCase(strArr[i].charAt(j)));
				else
					sb.append(Character.toLowerCase(strArr[i].charAt(j)));
			}
			if (i == strArr.length - 1) break;
			sb.append(" ");
		}

		return sb.toString();
	}
}
