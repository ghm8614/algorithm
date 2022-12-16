package level2.sol12951;

public class Answer02 {
	public String solution(String s) {
		
		StringBuilder sb = new StringBuilder();
		String[] strArr = s.toLowerCase().split("");
		boolean flag = true;

		for (String str : strArr) {
			sb.append(flag ? str.toUpperCase() : str);
			flag = str.equals(" ") ? true : false;
		}

		return sb.toString();
	}
}
