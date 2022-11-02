package level1.sol12918;

// 정규표현식 사용
public class Answer01 {
	public boolean solution(String s) {
        if (!(s.length() == 4 || s.length() == 6)) return false;

        // 숫자: ^[0-9]*$
        // 숫자가 맞으면 true, 아니면 false
		return s.matches("(^[0-9]*$)");
	}
}
