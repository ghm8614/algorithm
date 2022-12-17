package level2.stack_queue;

import java.util.Stack;

// Stack 사용
public class Answer01 {
	boolean solution(String s) {

		Stack<Character> st = new Stack<>();

		int length = s.length();
		for (int i = 0; i < length; i++) {
			char c = s.charAt(i);

			if (c == '(') {
				st.push('(');
			} else if (!st.empty()) {	// c == ')'이고 st이 비어있지 않을 때 pop
				st.pop();
			} else if (st.empty()) {	// 빈 st에 ')' 사용한 경우
				return false;
			}
		}

		return (st.empty()) ? true : false;
	}
}
