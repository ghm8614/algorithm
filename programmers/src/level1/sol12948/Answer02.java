package level1.sol12948;

public class Answer02 {
	// substring()
	public String solution(String phone_number) {
		int size = phone_number.length();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size - 4; i++) {
			sb.append("*");
		}
		sb.append(phone_number.substring(size - 4, size));
		return sb.toString();
	}

}
