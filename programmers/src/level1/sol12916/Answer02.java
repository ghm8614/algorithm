package level1.sol12916;

// 람다식 사용
public class Answer02 {
	boolean solution(String s) {
		s = s.toUpperCase();

		return s.chars().filter(e -> 'P' == e).count() == s.chars().filter(e -> 'Y' == e).count();
	}
}
