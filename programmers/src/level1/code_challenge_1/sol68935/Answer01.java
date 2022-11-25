package level1.code_challenge_1.sol68935;

// parseInt method를 사용해서 3진접을 10진법으로
public class Answer01 {
	public int solution(int n) {

		int divisor = 3;
		StringBuilder sb = new StringBuilder();

		while (n != 0) {
			sb.append(Integer.toString(n % divisor));
			n /= divisor;
		}

		// 3진법 -> 10진법
		return Integer.parseInt(sb.toString(),3);
	}
}
