package level1.sol12916;

// Solution과 거의 동일
// 변수 하나만 사용
public class Answer01 {
	boolean solution(String s) {
		int count = 0;

		// 문자열 전부 소문자로 변환
		s = s.toLowerCase();

		// p,y 모두 없을 시, true 리턴
		if (!(s.contains("p") || s.contains("y")))
			return true;

		// 반복문으로 p,y 개수 구하기
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'p') {
				count++;
			} else if (s.charAt(i) == 'y') {
				count--;
			}
		}
		return count == 0 ? true : false;
	}
}
