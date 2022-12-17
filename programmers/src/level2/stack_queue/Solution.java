package level2.stack_queue;

// 올바른 괄호
public class Solution {
	boolean solution(String s) {
		int count = 0;
		int length = s.length();

		// s.length()가 홀수면 false
		// 첫문자 '(', 마지막 문자 ')' 아니면 false
		if ((length % 2) != 0 || s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(') {
			return false;
		}

		// 두 문자의 개수가 같으면 true
		for (int i = 0; i < length; i++) {
			char c = s.charAt(i);
			
			if (c == '(') count++;
			else count--;

			// ')'가 먼저 나올 시, false
			if (count == -1)
				return false;
		}

		return (count == 0) ? true : false;
	}
}
