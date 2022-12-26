package level1.sol147355;

// 크기가 작은 부분 문자열

// 조건에서 p의 최대 길이가 18이므로, int 범위를 넘어감(long 사용 !)
public class Answer01 {
	public int solution(String t, String p) {
		int answer = 0;
		int lengthOfP = p.length();
		int lengthOfT = t.length();
		int i = 0;
		long a = Long.parseLong(p);

		while (true) {
			// 반복문 돌며, p의 길이만큼 t를 자른다.
			String str = t.substring(i, i + lengthOfP);

			// p보다 같거나 작으면 answer++
			if (Long.parseLong(str) <= a)
				answer++;

			if (i == lengthOfT - lengthOfP)
				break;
			else
				i++;
		}

		return answer;
	}
}
