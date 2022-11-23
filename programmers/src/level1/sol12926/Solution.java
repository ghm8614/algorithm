package level1.sol12926;

// 시저암호
public class Solution {
	public String solution(String s, int n) {
		StringBuilder sb = new StringBuilder();

		// String s 반복문 돌며, n만큼 더하기
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			// 공백은 그대로
			if (c == ' ') {
				sb.append(c);
				continue;
			}
			// 소문자, 대문자일 경우의 각각의 순환암호가 존재해야한다.
			if (c >= 'a' && c <= 'z') {
				if (c + n > 122) {
					sb.append((char) (c + n - 26));
				} else {
					sb.append((char) (c + n));
				}
			} else if (c >= 'A' && c <= 'Z') {
				if (c + n > 90) {
					sb.append((char) (c + n - 26));
				} else {
					sb.append((char) (c + n));
				}
			}
		}
		System.out.println(sb);

		return sb.toString();
	}
}
