package level1.sol12948;

public class Answer01 {
	// String 메서드 사용(1.toCharArray(), 2.valueOf())
	// StringBuilder 사용x
	public String solution(String phone_number) {
		char[] ch = phone_number.toCharArray();
		int size = ch.length - 4;
		for (int i = 0; i < size; i++) {
			ch[i] = '*';
		}
		return String.valueOf(ch);
	}
}
