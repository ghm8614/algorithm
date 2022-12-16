package level2.sol12951;

// JadenCase 문자열 만들기
public class Answer01 {
	public String solution(String s) {
		
		String answer = "";
		
		// 전부 소문자로 변경하고 한 문자씩 배열에 넣기
		String[] strArr = s.toLowerCase().split("");
		boolean flag = true;

		// 공백 다음에 오는 첫 문자가 대문자
		for (String str : strArr) {
			answer += flag ? str.toUpperCase() : str;
			flag = str.equals(" ") ? true : false;
		}

		return answer;
	}
}
