package level1.sol147355;

// while 대신 for문
// 변수명 수정
public class Answer02 {
	public int solution(String t, String p) {
		int answer = 0;
		int lengthOfP = p.length();
		int lengthOfT = t.length();
		long pValue = Long.parseLong(p);

		for (int i = 0; i <= lengthOfT - lengthOfP; i++) {
			long tValue = Long.parseLong(t.substring(i, i + lengthOfP));
			if (tValue <= pValue)
				answer++;
		}

		return answer;
	}
}
